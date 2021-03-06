package br.com.guiato.solrtechtalk.service

import br.com.guiato.solrtechtalk.model.Country;
import br.com.guiato.solrtechtalk.model.State;
import br.com.guiato.solrtechtalk.model.City;

class SQLService {

    boolean transactional = true
    
    def findAllCoutries() {
    	List<Country> countries = Country.list();
    	return countries
    }

    def findStatesByCountry(Country country) {
    	List<State> states = State.findAllByCountry(country)
    	return states
    }

    def listCitiesByState(State state) {
    	List<City> cities = City.findAllByState(state)
    	return cities
    }
}
