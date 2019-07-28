package by.polmak.dao;

import by.polmak.model.Deal;
import java.util.List;
import java.util.Optional;

/**
 * Deal DAO Interface.
 */
public interface DealDao {

    /**
     * Get all Deals in whole Sales Funnel.
     *
     * @return list of all Deals.
     */
    List<Deal> findAll();

    /**
     * Get all Deals with specified Sales Stage id.
     *
     * @param salesStageId Sales Stage id.
     * @return list of Deals by Stage id.
     */
    List<Deal> findBySalesStageId(Integer salesStageId);

    /**
     * Get Deal with specified id.
     *
     * @param dealId Deal id.
     * @return Deal by id.
     */
    Optional<Deal> findById(Integer dealId);

    /**
     * Persist new Deal.
     *
     * @param deal Deal.
     * @return Deal.
     */
    Deal add(Deal deal);

    /**
     * Update Deal.
     *
     * @param deal Deal.
     */
    void update(Deal deal);

    /**
     * Delete Deal with specified id.
     *
     * @param dealId Deal id.
     */
    void delete(Integer dealId);

}
