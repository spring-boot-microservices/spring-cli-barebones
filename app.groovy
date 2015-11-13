@RestController
class HelloWorldController {
    @RequestMapping("/")
    String home() {
        "Hello, World!"
    }
}

