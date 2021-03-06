package osmedile.intellij.stringmanip.swap;

import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.editor.Editor;
import org.apache.commons.lang.NotImplementedException;
import osmedile.intellij.stringmanip.AbstractStringManipAction;

public class SwapQuoteAction extends AbstractStringManipAction {

	@Override
	protected String transformSelection(Editor editor, DataContext dataContext, String s, Object additionalParam) {
		return s.contains("'") ? s.replace("'", "\"") : s.replace("\"", "'");
	}

	@Override
	public String transformByLine(String s) {
		throw new NotImplementedException();
	}

}
