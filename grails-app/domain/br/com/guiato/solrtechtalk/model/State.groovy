package br.com.guiato.solrtechtalk.model

import org.grails.solr.Solr

class State {

	// enable indexing of a domain class. This will enable the dynamic methods on the domain object.
	static enableSolrSearch = true

	//To have the index updated on inserts, updates and deletes of your domain classes
	static solrAutoIndex = true
	
	static hasOne = [country: Country] 
    static hasMany = [cities: City]

    static mapping = {
    	version false
    }

    @Solr(field="id")
    Long id

    @Solr(field="name")
    String name

    @Solr(field="uf")
    String uf

    String toString() {
    	return name
    }
}
