package com.example.fizzbuzz;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

// utilisation la plateforme Junit pour exécuter nos scénarios
@Suite
@IncludeEngines("cucumber")
// les fichiers .feature sont dans le dossier features des ressources de tests
@SelectClasspathResource("features")
// les Steps et la config Spring seront à chercher dans le package indiqué ici
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.example.fizzbuzz")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, json:target/cucumber.json, html:target/reports/cucumber/rapport.html,"
        + " usage:target/usage.jsonx, junit:target/junit.xml")
public class CucumberRunnerTest {

}
