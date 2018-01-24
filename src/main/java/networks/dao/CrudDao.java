package networks.dao;

import networks.model.AbstractEntity;

import java.util.List;

public interface CrudDao <T extends AbstractEntity, USER_ID> {

    void update (T entity);
    void create (T entity);
    void delete (USER_ID id);

    List<T> findAll();
}
