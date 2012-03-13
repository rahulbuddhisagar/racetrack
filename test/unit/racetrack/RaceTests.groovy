package racetrack
import grails.test.*;
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
//@TestFor(Race)
class RaceTests extends GrailsUnitTestCase {

	protected void setUp(){
		super.setUp();	
	}
	
	protected void tearDown(){
		super.tearDown()	
	}
	
    void testInMiles(){
		def race = new Race(distance:5.0)
		assertEquals 3.10700, race.inMiles()	
	}
}
