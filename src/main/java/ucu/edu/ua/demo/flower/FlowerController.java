package ucu.edu.ua.demo.flower;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/flower")
public class FlowerController {
    @GetMapping
    public List<Flower> getFlowers(){
        return List.of(new Flower(12.2, FlowerColor.RED, 10, FlowerType.ROSE));
    }
}
