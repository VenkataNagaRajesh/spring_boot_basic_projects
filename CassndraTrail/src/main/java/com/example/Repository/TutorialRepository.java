package com.example.Repository;
import java.util.List;
import java.util.UUID;

import org.springframework.data.cassandra.repository.*;

import com.example.Entity.Tutorial;

public interface TutorialRepository extends CassandraRepository<Tutorial, UUID>
{

	@AllowFiltering
	List<Tutorial> findByPublished(boolean published);
	
	List<Tutorial> findByTitleContaining(String title);
}
