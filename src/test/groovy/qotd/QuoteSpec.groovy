package qotd

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Quote)
class QuoteSpec extends Specification {

  def "test for valid quote test"(){
  
  when: 'text is empty'
  def q = new Quote(text: '')
  
  then: 'validation should fail'
  !q.validate()

  when: 'text is null'
  def q1 = new Quote(text: null)
  
  then: 'validation should fail'
  !q1.validate()
  
  when: 'text is valid'
  def q2 = new Quote(text: 'Some memorable words...')
  
  then: 'validation should pass'
  q2.validate()
  }
  }