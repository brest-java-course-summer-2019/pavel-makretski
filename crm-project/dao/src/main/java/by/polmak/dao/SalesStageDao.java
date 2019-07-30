package by.polmak.dao;

import by.polmak.model.SalesStage;
import java.util.List;
import java.util.Optional;

/**
 * SalesStage DAO Interface.
 */
public interface SalesStageDao {

    /**
     * Persist new Sales Stage in Sales Funnel.
     *
     * @param salesStageName new Sales Stage.
     * @return new Sales Stage object.
     */
    SalesStage add(SalesStage salesStageName);

    /**
     * Update Sales Stage's name.
     *
     * @param salesStageName Sales Stage.
     */
//    void update(SalesStage salesStageName);
//
//    /**
//     * Delete Sales Stage from Funnel with specified id.
//     *
//     * @param salesStageId Sales Stage specified id.
//     */
//    void delete(Integer salesStageId);
//
//    /**
//     * Get Sales Funnel.
//     *
//     * @return sales Stages list.
//     */
//    List<SalesStage> findAll();
//
//    /**
//     * Get SalesStage By Id.
//     *
//     * @param salesStageId Sales Stage specified id.
//     * @return SalesStage via id.
//     */
//    Optional<SalesStage> findById(Integer salesStageId);

}
