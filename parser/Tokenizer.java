package project.parser;

import java.io.IOException;
import project.parser.ast.Season;

public interface Tokenizer extends AutoCloseable {

	TokenType next() throws TokenizerException;

	TokenType tokenType();

	String tokenString();

	int intValue();

	boolean boolValue();
	
	Season seasonValue();

	public void close() throws IOException;

	int getLineNumber();

}