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

        def result = Country.searchSolr("${Country.solrFieldName('name')}:Brasil")

        result.resultList.each {
            println "${it.name}"
        }
        
    }

    def indexStatesToSolr() {0
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
}
