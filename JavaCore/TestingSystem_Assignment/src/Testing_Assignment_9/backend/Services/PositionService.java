package Testing_Assignment_9.backend.Services;

import Testing_Assignment_9.backend.repository.PositionRepository;
import Testing_Assignment_9.entity.Position;

import java.util.List;

public class PositionService implements IPositionService {
    private final PositionRepository poRepo;

    public PositionService(PositionRepository poRepo) {
        this.poRepo = poRepo;
    }

    @Override
    public List<Position> getAll(){
        return poRepo.findAll();
    }
}
