import spock.lang.*
import org.apache.poi.ss.usermodel.WorkbookFactory

class InsideSpock extends Specification {

    def "first feature (runs)"() {
        expect:
        true
    }

    def "should open workbook"() {
        given:
        File file = new File('debug.xlsx')

        expect:
        println "Creating workbook object"
        def workbook = WorkbookFactory.create(file)
        println "Workbook object created"

        cleanup:
        workbook.close()
    }

    def "third feature (doesn't run?)"() {
        expect:
        true
    }

}
