module nl.jaapcoomans.boardgame.persistence {
	requires transitive nl.jaapcoomans.boardgame.domain;

	requires transitive java.persistence;
	requires spring.data.jpa;
	requires spring.tx;

	requires com.fasterxml.classmate;
	requires com.zaxxer.hikari;
	requires net.bytebuddy;

	requires jdk.unsupported;

	exports nl.jaapcoomans.boardgame.persist;

	opens nl.jaapcoomans.boardgame.persist to org.hibernate.orm.core, spring.core;
}