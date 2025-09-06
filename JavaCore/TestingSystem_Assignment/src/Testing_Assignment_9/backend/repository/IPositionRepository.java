package Testing_Assignment_9.backend.repository;

import Testing_Assignment_9.entity.Position;

import java.util.List;

public interface IPositionRepository {
    List<Position> findAll();
}
