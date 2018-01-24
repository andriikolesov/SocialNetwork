package tranning.Task9.Beer;

import tranning.Task9.Beer.Model.AbstractBeer;
import tranning.Task9.Beer.Model.Obolon;

import java.util.List;

public interface CrudService<T extends AbstractBeer, BEER_ID> {

    void save (T entity);

    void  update (T entity);

    void delete (BEER_ID id);

    List<T> findAll();

}
