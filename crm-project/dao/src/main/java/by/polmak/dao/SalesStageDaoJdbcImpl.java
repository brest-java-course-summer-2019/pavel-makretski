package by.polmak.dao;

import by.polmak.model.SalesStage;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

/**
 * Sales Stage DAO Interface implementation.
 */
@Component
public class SalesStageDaoJdbcImpl implements SalesStageDao {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private final static String ADD_STAGE =
            "insert into stage (sales_stage_name) values (:salesStageName)";

//    private final static String SELECT_ALL_STAGES =
//            "select sales_stage_id, sales_stage_name from stage order by sales_stage_id";
//    private static final String FIND_STAGE_BY_ID =
//            "select sales_stage_id, sales_stage_name from stage where sales_stage_id = :salesStageId";
//    private static final String UPDATE_STAGE =
//            "update stage set sales_stage_name = :salesStageName where sales_stage_id = :salesStageId";
//    private static final String DELETE_STAGE =
//            "delete from stage where sale_stage_id = :salesStageId";
//    private static final String STAGE_ID = "salesStageId";

    public SalesStageDaoJdbcImpl(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    /**
     * @param salesStage salesStage.
     * @return salesStage.
     */
    @Override
    public SalesStage add(SalesStage salesStage) {
        MapSqlParameterSource parameters = new MapSqlParameterSource();
        parameters.addValue("salesStageName", salesStage.getSalesStageName());
        KeyHolder generatedKeyHolder = new GeneratedKeyHolder();
        namedParameterJdbcTemplate.update(ADD_STAGE, parameters, generatedKeyHolder);
        salesStage.setSalesStageId(generatedKeyHolder.getKey().intValue());
        return salesStage;
    }


//
//
//
//    @Override
//    public void update(Department department) {
//        Optional.of(namedParameterJdbcTemplate.update(UPDATE, new BeanPropertySqlParameterSource(department)))
//                .filter(this::successfullyUpdated)
//                .orElseThrow(() -> new RuntimeException("Failed to update department in DB"));
//    }
//
//    private boolean successfullyUpdated(int numRowsUpdated) {
//        return numRowsUpdated > 0;
//    }
//
//    @Override
//    public SalesStage add(SalesStage salesStageName) {
//        return null;
//    }
//
//    @Override
//    public void update(SalesStage salesStageName) {
//
//    }
//
//    @Override
//    public void delete(Integer departmentId) {
//        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
//        mapSqlParameterSource.addValue(DEPARTMENT_ID, departmentId);
//        Optional.of(namedParameterJdbcTemplate.update(DELETE, mapSqlParameterSource))
//                .filter(this::successfullyUpdated)
//                .orElseThrow(() -> new RuntimeException("Failed to delete department from DB"));
//    }
//
//    @Override
//    public List<Department> findAll() {
//        List<Department> departments = namedParameterJdbcTemplate.query(SELECT_ALL, new DepartmentRowMapper());
//        return departments;
//    }
//
//    @Override
//    public Optional<Department> findById(Integer departmentId) {
//        SqlParameterSource namedParameters = new MapSqlParameterSource(DEPARTMENT_ID, departmentId);
//        List<Department> results = namedParameterJdbcTemplate.query(FIND_BY_ID, namedParameters,
//                BeanPropertyRowMapper.newInstance(Department.class));
//        return Optional.ofNullable(DataAccessUtils.uniqueResult(results));
//    }
//
//    private class DepartmentRowMapper implements RowMapper<Department> {
//        @Override
//        public Department mapRow(ResultSet resultSet, int i) throws SQLException {
//            Department department = new Department();
//            department.setDepartmentId(resultSet.getInt("department_id"));
//            department.setDepartmentName(resultSet.getString("department_name"));
//            return department;
//        }
//    }

}
