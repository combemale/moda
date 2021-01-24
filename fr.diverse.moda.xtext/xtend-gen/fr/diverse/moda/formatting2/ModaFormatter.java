/**
 * generated by Xtext 2.24.0
 */
package fr.diverse.moda.formatting2;

import com.google.inject.Inject;
import fr.diverse.moda.model.moda.Data;
import fr.diverse.moda.model.moda.MODAModel;
import fr.diverse.moda.model.moda.MODARelation;
import fr.diverse.moda.model.moda.Model;
import fr.diverse.moda.model.moda.RunningSoftware;
import fr.diverse.moda.model.moda.STS;
import fr.diverse.moda.services.ModaGrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class ModaFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private ModaGrammarAccess _modaGrammarAccess;
  
  protected void _format(final MODAModel mODAModel, @Extension final IFormattableDocument document) {
    EList<Model> _model = mODAModel.getModel();
    for (final Model model : _model) {
      document.<Model>format(model);
    }
    EList<Data> _data = mODAModel.getData();
    for (final Data data : _data) {
      document.<Data>format(data);
    }
    document.<RunningSoftware>format(mODAModel.getSoftware());
    document.<STS>format(mODAModel.getSts());
    EList<MODARelation> _modarelation = mODAModel.getModarelation();
    for (final MODARelation mODARelation : _modarelation) {
      document.<MODARelation>format(mODARelation);
    }
  }
  
  public void format(final Object mODAModel, final IFormattableDocument document) {
    if (mODAModel instanceof XtextResource) {
      _format((XtextResource)mODAModel, document);
      return;
    } else if (mODAModel instanceof MODAModel) {
      _format((MODAModel)mODAModel, document);
      return;
    } else if (mODAModel instanceof EObject) {
      _format((EObject)mODAModel, document);
      return;
    } else if (mODAModel == null) {
      _format((Void)null, document);
      return;
    } else if (mODAModel != null) {
      _format(mODAModel, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(mODAModel, document).toString());
    }
  }
}