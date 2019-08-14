package by.polmak.dao;

import by.polmak.model.SalesStage;

import java.util.List;
import java.util.Optional;

/**
 * SalesStage DAO Interface.
 * @author Polmak Retski
 */
public interface SalesStageDao {

    /**
     * Persist new Sales Stage in Sales Funnel.
     *
     * @param salesStageName new Sales Stage.
     * @return new Sales Stage object.
     */
    SalesStage addStage(SalesStage salesStageName);

    /**
     * Update Sales Stage's name.
     *
     * @param salesStageName Sales Stage.
     */
    void updateStage(SalesStage salesStageName);

    /**
     * Delete Sales Stage from Funnel with specified Id.
     *
     * @param salesStageId Sales Stage specified Id.
     */
    void deleteStage(Integer salesStageId);

    /**
     * Get Sales Funnel.
     *
     * @return sales all Stages in list.
     */
    List<SalesStage> findAll();

    /**
     * Get SalesStage By Id.
     *
     * @param salesStageId Sales Stage specified id.
     * @return Sales Stage via id.
     */
    Optional<SalesStage> findById(Integer salesStageId);

}
