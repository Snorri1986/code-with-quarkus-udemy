package org.snorri1986;



import io.quarkus.panache.common.Sort;
import io.smallrye.mutiny.Uni;
import org.snorri1986.hibernate.Fruit;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Path;
import java.util.List;


@Path("/fruits")
@ApplicationScoped
public class FruitResource {

    public Uni<List<Fruit>> get() {
        return Fruit.listAll(Sort.by("name"));
    }

}
