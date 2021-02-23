package cas.projecttask.repository;


import cas.projecttask.entity.Data;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DataRepository extends JpaRepository<Data, Integer> {

    Optional<Data> findById(Integer id);
}
