/**
 */
package Y3853992;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conflict</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Y3853992.Conflict#getFirst <em>First</em>}</li>
 *   <li>{@link Y3853992.Conflict#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @see Y3853992.Y3853992Package#getConflict()
 * @model annotation="gmf.link source='first' target='second' style='dot' color='255,0,0' width='2'"
 * @generated
 */
public interface Conflict extends EObject {
	/**
	 * Returns the value of the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' reference.
	 * @see #setFirst(Requirement)
	 * @see Y3853992.Y3853992Package#getConflict_First()
	 * @model
	 * @generated
	 */
	Requirement getFirst();

	/**
	 * Sets the value of the '{@link Y3853992.Conflict#getFirst <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(Requirement value);

	/**
	 * Returns the value of the '<em><b>Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second</em>' reference.
	 * @see #setSecond(Requirement)
	 * @see Y3853992.Y3853992Package#getConflict_Second()
	 * @model
	 * @generated
	 */
	Requirement getSecond();

	/**
	 * Sets the value of the '{@link Y3853992.Conflict#getSecond <em>Second</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second</em>' reference.
	 * @see #getSecond()
	 * @generated
	 */
	void setSecond(Requirement value);

} // Conflict
