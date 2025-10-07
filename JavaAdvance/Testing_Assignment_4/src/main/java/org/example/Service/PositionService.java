package org.example.Service;

import org.example.Entity.Position;
import org.example.Repository.PositionRepository;

public class PositionService {
    private PositionRepository positionRepository;

    //constructor
    public PositionService(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }

    public void createPosition(Position position){
        positionRepository.save(position);
    }
}
