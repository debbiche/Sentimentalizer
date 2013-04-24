package org.panhandlers.sentimentalizer.testing;

import java.util.ArrayList;

import org.panhandlers.sentimentalizer.AlternatePerceptron;
import org.panhandlers.sentimentalizer.AveragedPerceptron;
import org.panhandlers.sentimentalizer.Classifier;
import org.panhandlers.sentimentalizer.NaiveBayes;



public class TestRunner {
	private static final String[] CATEGORIES = new String[]{"books"};//, "camera", "dvd", "health", "music", "software"};
	private static final int RATIO = 10;
	private static final int DICTIONARY_SIZE = 1500;
	private static final int CROSS_VALIDATION_SLICES = 10;
	private ArrayList<Test> tests;
	private TestEnvironment env;
	
	public TestRunner(){
		tests = new ArrayList<Test>();
		env = new TestEnvironment();
		createTests();
	}
	
	private void createTests() {
		Test t;
		int i = 1;
		Classifier[] classifiers = new Classifier[]{new NaiveBayes(env.getStorage())};
		for (Classifier classifier : classifiers) {
			CategoryTest categoryTest = new CategoryTest(env, classifier, RATIO, DICTIONARY_SIZE);
			tests.add(categoryTest);
			/*
			 * Run in-domain tests
			 */
			for (String category : CATEGORIES) {
//				t = new SentimentTest(env, classifier, RATIO, DICTIONARY_SIZE, category);
			//	tests.add(t);
//				t = new CrossValidation(env, classifier, RATIO, DICTIONARY_SIZE, CROSS_VALIDATION_SLICES, category);
//				tests.add(t);
//				t = new SentimentTest(env, classifier, RATIO, DICTIONARY_SIZE, category);
//				tests.add(t);
//				for(; i < CATEGORIES.length; i++) {
//					t = new SentimentTest(env, classifier, RATIO, DICTIONARY_SIZE, category, CATEGORIES[i]);
//					tests.add(t);
//				}
			}
		}
	}

	public void runTests() {
		for (Test t : tests) {
			t.run();
		}
		for (Test t : tests) {
			System.out.println(t.toString());
		}
	}
	
	public static void main(String[] args) {
		TestRunner runner = new TestRunner();
		runner.runTests();
	}
}
