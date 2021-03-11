import org.apache.poi.ss.usermodel.WorkbookFactory

class OutsideSpock {

    static void main(String[] args) {
        File file = new File('debug.xlsx')
        println "Creating workbook object"
        def workbook = WorkbookFactory.create(file)
        println "Workbook object created"
        workbook.close()
    }

}
