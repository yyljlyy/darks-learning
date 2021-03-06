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
package darks.learning.distance;

import java.io.File;

import darks.learning.word2vec.Word2Vec;

public class Word2vecWordDistance extends Distance<String>
{
	
	Word2Vec word2Vec;
	
	public Word2vecWordDistance(String modelPath)
	{
		super(TYPE_SIMILAR);
		word2Vec = new Word2Vec();
		word2Vec.loadModel(new File(modelPath));
	}

	@Override
	public double distance(String a, String b)
	{
		return word2Vec.distance(a, b);
	}

}
