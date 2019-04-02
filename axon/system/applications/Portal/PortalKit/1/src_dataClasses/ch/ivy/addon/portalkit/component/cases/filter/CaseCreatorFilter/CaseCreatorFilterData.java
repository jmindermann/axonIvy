package ch.ivy.addon.portalkit.component.cases.filter.CaseCreatorFilter;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class CaseCreatorFilterData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class CaseCreatorFilterData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -7188791860224113243L;

  private java.lang.String queryAutoComplete;

  /**
   * Gets the field queryAutoComplete.
   * @return the value of the field queryAutoComplete; may be null.
   */
  public java.lang.String getQueryAutoComplete()
  {
    return queryAutoComplete;
  }

  /**
   * Sets the field queryAutoComplete.
   * @param _queryAutoComplete the new value of the field queryAutoComplete.
   */
  public void setQueryAutoComplete(java.lang.String _queryAutoComplete)
  {
    queryAutoComplete = _queryAutoComplete;
  }

  private java.util.List<ch.ivy.addon.portalkit.bo.RemoteSecurityMember> creators;

  /**
   * Gets the field creators.
   * @return the value of the field creators; may be null.
   */
  public java.util.List<ch.ivy.addon.portalkit.bo.RemoteSecurityMember> getCreators()
  {
    return creators;
  }

  /**
   * Sets the field creators.
   * @param _creators the new value of the field creators.
   */
  public void setCreators(java.util.List<ch.ivy.addon.portalkit.bo.RemoteSecurityMember> _creators)
  {
    creators = _creators;
  }

}
