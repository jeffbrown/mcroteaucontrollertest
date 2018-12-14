package mcroteaucontrollertest

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

import static org.springframework.http.HttpStatus.METHOD_NOT_ALLOWED

class DemoControllerSpec extends Specification implements ControllerUnitTest<DemoController> {

    void "test GET request"() {
        when:
        controller.index()

        then:
        response.text == 'Success'
    }

    void "test POST request"() {
        when:
        request.method = 'POST'
        controller.index()

        then:
        response.status == METHOD_NOT_ALLOWED.value()
    }
}
