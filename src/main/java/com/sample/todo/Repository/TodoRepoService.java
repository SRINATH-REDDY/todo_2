package com.sample.todo.Repository;

import com.sample.todo.model.Todo;
import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepoService extends DatastoreRepository<Todo,Long>
{

}
