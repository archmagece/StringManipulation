package osmedile.intellij.stringmanip.styles;

import org.apache.commons.lang.WordUtils;

public class WordsCapitalizeFullyAction extends AbstractCaseConvertingAction {

	public String transform(String s) {
		return WordUtils.capitalizeFully(s);
	}
}
