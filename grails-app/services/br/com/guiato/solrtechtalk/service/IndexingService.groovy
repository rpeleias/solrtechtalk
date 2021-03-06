package br.com.guiato.solrtechtalk.service

import br.com.guiato.solrtechtalk.model.*;

import org.grails.solr.Solr
import org.apache.solr.client.solrj.SolrQuery
import org.apache.solr.client.solrj.SolrQuery.ORDER

class IndexingService {

    def indexCountriesToSolr() {
    	def countries = Country.list()

    	countries.each { country ->
            country.indexSolr()
    	}
    }

    def indexStatesToSolr() {
    	def states = State.list()

    	states.each { state ->
    		state.indexSolr()
    	}
    }   

    def indexCitiesToSolr() {
    	def cities = City.list()

    	cities.each { city ->        
            city.indexSolr()
    	}
    }

    def deleteCountriesOfSolr() {
        def countries = Country.list()

        countries.each { country ->
            country.deleteSolr()
        }
    }

    def deleteStatesOfSolr() {
        def states = State.list()

        states.each { state ->
            state.deleteSolr()
        }
    }

    def deleteCitiesOfSolr() {
        def cities = City.list()

        cities.each { city ->        
            city.deleteSolr()
        }
    }
}
