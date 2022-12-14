package com.bakhanovich.interviews.shoppingcart.dao;

import com.bakhanovich.interviews.shoppingcart.exception.DuplicateException;
import com.bakhanovich.interviews.shoppingcart.model.impl.Article;

import java.util.List;
import java.util.Optional;

/**
 * The interface, that implements DAO for the {@link Article} entity.
 *
 * @author Ihar Bakhanovich.
 */
public interface ArticleDao extends Dao<Article> {

    /**
     * Saves {@link Article} in the database.
     *
     * @param entity is the {@link Article} to save.
     * @throws DuplicateException if a SQLException with the state 23505 or the state 23000 is thrown.
     */
    @Override
    void save(Article entity) throws DuplicateException;

    /**
     * Finds all {@link Article} entity in the database.
     *
     * @return List of the {@link Article} objects.
     */
    @Override
    List<Article> findAll();

    /**
     * Finds {@link Optional <Article>} in the database by the id of the {@link Article}.
     *
     * @param id is the {@link long} to find.
     * @return {@link Optional<Article>}.
     */
    @Override
    Optional<Article> findById(long id);

    /**
     * Updates the {@link Article}.
     *
     * @param entity is the value of the {@link Article} to update.
     */
    @Override
    void update(Article entity);

    /**
     * Removes the {@link Article} object from the database.
     *
     * @param id is the id of the entity to be deleted.
     */
    @Override
    void delete(long id);

//    /**
//     * Removes records from 'user_order_article' table by articleId.
//     *
//     * @param articleId is the id to remove by.
//     */
//    void deleteFromUserOrderedArticleByArticleId(long articleId);

}
