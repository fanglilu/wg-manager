package fanglilu.wgmanager.restcontroller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class TestController {

    @GetMapping("")
    fun test(): ResponseEntity<Any> {
        return ResponseEntity("test ABCD", HttpStatus.OK)
    }
}
