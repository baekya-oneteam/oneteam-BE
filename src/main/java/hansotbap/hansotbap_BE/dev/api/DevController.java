package hansotbap.hansotbap_BE.dev.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class DevController {
    @GetMapping
    public String ping() {
        return "pong";
    }
}
