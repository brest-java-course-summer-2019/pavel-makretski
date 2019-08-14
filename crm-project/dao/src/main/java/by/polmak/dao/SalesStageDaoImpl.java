package by.polmak.dao;

import by.polmak.model.SalesStage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

/**
 * Sales Stage DAO Interface implementation.
 * @author Polmak Retski
 */
@Component
public class SalesStageDaoImpl implements SalesStageDao {

    /**
     * Default logger for current class
     */
    private final static Logger LOGGER = LoggerFactory.getLogger(SalesStageDaoImpl.class);

    private final static String SELECT_ALL_STAGES =
            "select sales_stage_id, sales_stage_name, sales_stage_deals, sales_stage_budget "
                    + "from stage order by sales_stage_id";

    private final static String FIND_STAGE_BY_ID =
            "select sales_stage_id, sales_stage_name, sales_stage_deals, sales_stage_budget "
                    + "from stage where sales_stage_id = :salesStageId";

    private final static String FIND_STAGE_BY_NAME =
            "select sales_stage_id, sales_stage_name, sales_stage_deals, sales_stage_budget "
                    + "from stage where sales_stage_name = :salesStageName";

    private final static String ADD_STAGE =
            "insert into stage (sales_stage_name) values (:salesStageName)";

    private final static String UPDATE_STAGE =
            "update stage set sales_stage_name = :salesStageName where sales_stage_id = :salesStageId";

    private final static String DELETE_STAGE_BY_ID =
            "delete from stage where sales_stage_id = :salesStageId";

    private final static String STAGE_ID = "salesStageId";
    private final static String STAGE_NAME = "salesStageName";
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    /**
     * Jdbc template to execute actions to data source
     */
    public SalesStageDaoImpl(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    /**
     * Persist new Sales Stage in Sales Funnel.
     *
     * @param salesStageName new Sales Stage.
     * @return new Sales Stage object.
     */
    @Override
    public SalesStage addStage(SalesStage salesStageName) {
        LOGGER.debug("addStage()", salesStageName);

        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource.addValue("salesStageName", salesStageName.getSalesStageName());
        KeyHolder generatedKeyHolder = new GeneratedKeyHolder();
        namedParameterJdbcTemplate.update(ADD_STAGE, parameterSource, generatedKeyHolder);
        salesStageName.setSalesStageId(generatedKeyHolder.getKey().intValue());
        return salesStageName;
    }

    /**
     * Update Sales Stage's name.
     *
     * @param salesStageName Sales Stage.
     */
    @Override
    public void updateStage(SalesStage salesStageName) {
        LOGGER.debug("updateStage()", salesStageName);

        Optional.of(namedParameterJdbcTemplate.update(UPDATE_STAGE, new BeanPropertySqlParameterSource(salesStageName)))
                .filter(this::successfullyUpdated)
                .orElseThrow(() -> new RuntimeException("Failed to update stage in DB"));
    }

    private boolean successfullyUpdated(int numRowsUpdate) {
        return numRowsUpdate > 0;
    }

    /**
     * Delete Sales Stage from Funnel with specified Id.
     *
     * @param salesStageId Sales Stage specified Id.
     */
    @Override
    public void deleteStage(Integer salesStageId) {
        LOGGER.debug("deleteStage()", salesStageId);

        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
        mapSqlParameterSource.addValue(STAGE_ID, salesStageId);
        Optional.of(namedParameterJdbcTemplate.update(DELETE_STAGE_BY_ID, mapSqlParameterSource))
                .filter(this::successfullyUpdated)
                .orElseThrow(() -> new RuntimeException("Failed to delete department from DB"));
    }

    /**
     * Get Sales Funnel.
     *
     * @return sales all Stages in list.
     */
    @Override
    public List<SalesStage> findAll() {
        LOGGER.debug("findAll()");

        List<SalesStage> salesStages = namedParameterJdbcTemplate.query(SELECT_ALL_STAGES, new SalesStageRowMapper());
        return salesStages;
    }

    /**
     * Get SalesStage By Id.
     *
     * @param salesStageId Sales Stage specified id.
     * @return Sales Stage via id.
     */
    @Override
    public Optional<SalesStage> findById(Integer salesStageId) {
        LOGGER.debug("findById()", salesStageId);

        SqlParameterSource namedParameters = new MapSqlParameterSource(STAGE_ID, salesStageId);
        List<SalesStage> results = namedParameterJdbcTemplate.query(FIND_STAGE_BY_ID, namedParameters,
                BeanPropertyRowMapper.newInstance(SalesStage.class));
        return Optional.ofNullable(DataAccessUtils.uniqueResult(results));
    }

    /**
     * Get SalesStage By Name.
     *
     * @param salesStageName Sales Stage unique name.
     * @return Sales Stage via name.
     */
    public Optional<SalesStage> findByName(String salesStageName) {
        LOGGER.debug("findByName()", salesStageName);

        SqlParameterSource namedParameters = new MapSqlParameterSource(STAGE_NAME, salesStageName);
        List<SalesStage> results = namedParameterJdbcTemplate.query(FIND_STAGE_BY_NAME, namedParameters,
                BeanPropertyRowMapper.newInstance(SalesStage.class));
        return Optional.ofNullable(DataAccessUtils.uniqueResult(results));
    }

    private class SalesStageRowMapper implements RowMapper<SalesStage> {
        @Override
        public SalesStage mapRow(ResultSet resultSet, int i) throws SQLException {
            SalesStage salesStage = new SalesStage();
            salesStage.setSalesStageId(resultSet.getInt("sales_stage_id"));
            salesStage.setSalesStageName(resultSet.getString("sales_stage_name"));
            return salesStage;
        }
    }
}
