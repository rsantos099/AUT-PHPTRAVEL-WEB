package curso.treinamento.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/features"},
		glue= {"curso.treinamento.steps"},
		snippets = SnippetType.UNDERSCORE,
		tags = {"@atividade"})

public class RunnerTest {}
