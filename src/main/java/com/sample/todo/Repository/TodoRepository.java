package com.sample.todo.Repository;

import com.sample.todo.model.Todo;
import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends DatastoreRepository<Todo,Long>
{



}
