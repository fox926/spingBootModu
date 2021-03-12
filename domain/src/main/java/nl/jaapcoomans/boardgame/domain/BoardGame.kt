package nl.jaapcoomans.boardgame.domain;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class BoardGame {
	private UUID id;
	private String title;
	private String author;
	private String publisher;
	private int minPlayers;
	private int maxPlayers;
	private List<GameMechanic> gameMechanics;
	private Integer boardGameGeekId;

	public BoardGame(final UUID id, final String title, final String author, final String publisher, final int minPlayers, final int maxPlayers,
		final List<GameMechanic> gameMechanics, final Integer boardGameGeekId) {

		this.id = id;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.minPlayers = minPlayers;
		this.maxPlayers = maxPlayers;
		this.gameMechanics = Collections.unmodifiableList(gameMechanics);
		this.boardGameGeekId = boardGameGeekId;
	}

	public UUID getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getMinPlayers() {
		return minPlayers;
	}

	public int getMaxPlayers() {
		return maxPlayers;
	}

	public List<GameMechanic> getGameMechanics() {
		return gameMechanics;
	}

	public Integer getBoardGameGeekId() {
		return boardGameGeekId;
	}
}
