package tranning.Task9.Beer.Impl;

import tranning.Task9.Beer.Beer;
import tranning.Task9.Beer.Model.Staropramen;
import tranning.Task9.Beer.StaropramenService;

import java.util.List;

public class StaropramenServiceImpl implements StaropramenService {

    Beer<String> beer = new Beer<>();

    @Override
    public void save(Staropramen entity) {
    }

    @Override
    public void update(Staropramen entity) {
    }

    @Override
    public void delete(Integer id) {
    }

    @Override
    public List<Staropramen> findAll() {
        return null;
    }
}
