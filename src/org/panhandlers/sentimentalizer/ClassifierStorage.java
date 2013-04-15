package org.panhandlers.sentimentalizer;

import java.util.List;
import java.util.Set;

public interface ClassifierStorage {
	public void addFeature(String category, Feature feature);
	public void addFeatures(String category, List<Feature> feature);
	public int getCategoryCount(String category);
	public int getFeatureCount(String category, Feature feature);
	public int getTotalCount();
	public Set<String> getCategories();
}
