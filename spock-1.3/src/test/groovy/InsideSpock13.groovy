import spock.lang.*
import org.apache.poi.ss.usermodel.WorkbookFactory

class InsideSpock13 extends Specification {

    def "first feature (runs)"() {
        expect:
        true
    }

    def "should open workbook (throws heap error)"() {
        given:
        File file = new File('../example.xlsx')

        expect:
        println "Creating workbook object"
        def workbook = WorkbookFactory.create(file)
        println "Workbook object created"

        cleanup:
        workbook.close()
    }

    def "third feature (runs)"() {
        expect:
        true
    }

}
