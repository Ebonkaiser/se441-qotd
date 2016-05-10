package qotd

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Attribution)
class AttributionSpec extends Specification {

    def "test for valid attribution name"(){
	
	when: 'name is empty'
	def a1 = new Attribution(name: '')
	
	then: 'validation should fail'
	!a1.validate()

	when: 'name is null'
    def a2 = new Attribution(name: null)
  
    then: 'validation should fail'
    !a2.validate()
  
    when: 'name is valid'
    def a3 = new Attribution(name: 'Anonymous')
  
    then: 'validation should pass'
    a3.validate()
	}
}