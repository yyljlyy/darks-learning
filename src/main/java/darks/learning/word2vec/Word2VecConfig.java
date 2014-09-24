/**
 * 
 * Copyright 2014 The Darks Learning Project (Liu lihua)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package darks.learning.word2vec;

import darks.learning.common.rand.JavaRandomFunction;
import darks.learning.common.rand.RandomFunction;
import darks.learning.word2vec.Word2Vec.Word2VecType;

/**
 * Build word2vec train parameters.
 * @author Darks.Liu
 *
 */
public class Word2VecConfig
{
	
	int featureSize = 100;
	
	Word2VecType trainType = Word2VecType.SKIP_GRAM;
	
	int window = 5;
	
	double sample = 1e-3;
	
	double learnRate = 0.025;
	
	int negative = 5;
	
	boolean useNegativeSampling = true;
	
	int negVocabSize = (int) 1e8;
	
	int maxExp = 6;
	
	int expTableSize = 1000;
	
	RandomFunction randomFunction = new JavaRandomFunction();
	
	boolean useStopwords = true;
	
	public Word2VecConfig()
	{
		
	}

	public Word2VecConfig setFeatureSize(int featureSize)
	{
		this.featureSize = featureSize;
		return this;
	}

	public Word2VecConfig setTrainType(Word2VecType trainType)
	{
		this.trainType = trainType;
		return this;
	}

	public Word2VecConfig setWindow(int window)
	{
		this.window = window;
		return this;
	}

	public Word2VecConfig setLearnRate(double learnRate)
	{
		this.learnRate = learnRate;
		return this;
	}

	public Word2VecConfig setNegative(int negative)
	{
		this.negative = negative;
		return this;
	}

	public Word2VecConfig setUseNegativeSampling(boolean useNegativeSampling)
	{
		this.useNegativeSampling = useNegativeSampling;
		return this;
	}

	public Word2VecConfig setNegVocabSize(int negVocabSize)
	{
		this.negVocabSize = negVocabSize;
		return this;
	}

	public Word2VecConfig setMaxExp(int maxExp)
	{
		this.maxExp = maxExp;
		return this;
	}

	public Word2VecConfig setExpTableSize(int expTableSize)
	{
		this.expTableSize = expTableSize;
		return this;
	}

	public Word2VecConfig setRandomFunction(RandomFunction randomFunction)
	{
		this.randomFunction = randomFunction;
		return this;
	}

	public Word2VecConfig setUseStopwords(boolean useStopwords)
	{
		this.useStopwords = useStopwords;
		return this;
	}

	public Word2VecConfig setSample(double sample)
	{
		this.sample = sample;
		return this;
	}
	
	
	public double getSample()
	{
		return sample;
	}

	public boolean isUseStopwords()
	{
		return useStopwords;
	}

	public int getFeatureSize()
	{
		return featureSize;
	}

	public Word2VecType getTrainType()
	{
		return trainType;
	}

	public int getWindow()
	{
		return window;
	}

	public double getLearnRate()
	{
		return learnRate;
	}
	
	public int getNegative()
	{
		return negative;
	}

	public boolean isUseNegativeSampling()
	{
		return useNegativeSampling;
	}

	public int getNegVocabSize()
	{
		return negVocabSize;
	}

	public int getMaxExp()
	{
		return maxExp;
	}

	public int getExpTableSize()
	{
		return expTableSize;
	}

	public RandomFunction getRandomFunction()
	{
		return randomFunction;
	}
	
	
	
}
