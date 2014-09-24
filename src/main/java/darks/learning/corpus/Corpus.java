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
package darks.learning.corpus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.math3.stat.Frequency;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import darks.learning.common.utils.IOUtils;
import darks.learning.exceptions.CorpusException;

/**
 * Train corpus
 * @author Darks.Liu
 *
 */
public class Corpus
{

	private static Logger log = LoggerFactory.getLogger(Corpus.class);
	
	private File file;
	
	private Frequency wordFreq;
	
	private BufferedReader reader;
	
	private StopwordDictionary stopwordDictionary;
	
	public Corpus()
	{
		
	}
	
	public Corpus(File file, Frequency wordFreq)
	{
		this.file = file;
		this.wordFreq = wordFreq;
	}
	
	public Corpus(File file, Frequency wordFreq, StopwordDictionary stopwordDictionary)
	{
		this.file = file;
		this.wordFreq = wordFreq;
		this.stopwordDictionary = stopwordDictionary;
	}
	
	/**
	 * Read one line from reader
	 * @return Line string
	 */
	public String readCorpusLine()
	{
		if (reader == null)
		{
			try
			{
				reader = new BufferedReader(new FileReader(file));
			}
			catch (FileNotFoundException e)
			{
				throw new CorpusException(e.getMessage(), e);
			}
		}
		try
		{
			return reader.readLine();
		}
		catch (IOException e)
		{
			log.error(e.getMessage(), e);
		}
		return null;
	}
	
	/**
	 * Close reader 
	 */
	public void closeReader()
	{
		IOUtils.closeStream(reader);
	}

	public BufferedReader getReader()
	{
		return reader;
	}

	public void setReader(BufferedReader reader)
	{
		this.reader = reader;
	}

	public Frequency getWordFreq()
	{
		return wordFreq;
	}

	public void setWordFreq(Frequency wordFreq)
	{
		this.wordFreq = wordFreq;
	}

	public StopwordDictionary getStopwordDictionary()
	{
		return stopwordDictionary;
	}

	public void setStopwordDictionary(StopwordDictionary stopwordDictionary)
	{
		this.stopwordDictionary = stopwordDictionary;
	}

	public File getFile()
	{
		return file;
	}

	public void setFile(File file)
	{
		this.file = file;
	}
	
	
}
