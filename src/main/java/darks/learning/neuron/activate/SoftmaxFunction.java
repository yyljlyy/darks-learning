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
package darks.learning.neuron.activate;

import org.jblas.DoubleMatrix;
import static darks.learning.common.utils.MatrixHelper.softmax;
import static darks.learning.common.utils.MatrixHelper.oneMinus;
/**
 * Softmax function
 * 
 * @author Darks.Liu
 *
 */
public class SoftmaxFunction extends AbstractActivateFunction
{

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DoubleMatrix activate(DoubleMatrix input)
	{
		return softmax(input);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DoubleMatrix derivative(DoubleMatrix input)
	{
		return softmax(input).mul(oneMinus(softmax(input)));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String name()
	{
		return "softmax";
	}
}
