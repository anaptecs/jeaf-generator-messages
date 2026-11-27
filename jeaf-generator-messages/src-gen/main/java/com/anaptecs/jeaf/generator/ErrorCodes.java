package com.anaptecs.jeaf.generator;

import com.anaptecs.jeaf.xfun.annotations.MessageResource;
import com.anaptecs.jeaf.xfun.api.XFun;
import com.anaptecs.jeaf.xfun.api.errorhandling.ErrorCode;
import com.anaptecs.jeaf.xfun.api.messages.MessageID;
import com.anaptecs.jeaf.xfun.api.messages.MessageRepository;

/**
 * Class contains message constants for JEAF Generator.
 *
 * @author JEAF Development Team
 * @version 1.3
 */
@MessageResource(path = "JEAFGeneratorMessages.xml")
public final class ErrorCodes {
  /**
   * Constant for XML file that contains all messages that are defined within this class.
   */
  private static final String MESSAGE_RESOURCE = "JEAFGeneratorMessages.xml";

  /**
   * Exceptions with this error code are thrown if the style sheet that defines the transformation of the XML document
   * containing error messages is not located within the applications class path.
   */
  public static final ErrorCode STYLESHEET_NOT_AVAILABLE;

  /**
   * Exceptions with this error code are thrown if the generator can not create an output directory for a generated
   * class.
   */
  public static final ErrorCode UNABLE_TO_CREATE_DIR;

  /**
   * Exceptions with this error code are thrown if an exception occurs during the generation of the Java class using
   * XSLT.
   */
  public static final ErrorCode UNABLE_TO_PERFORM_TRANSFORMATION;

  /**
   * Exceptions with this error code are thrown if an exception occurs during the generation of the Java class using
   * XSLT.
   */
  public static final ErrorCode INVALID_CLASS_INFO;

  /**
   * Exceptions with this error code are thrown when an exception occurs when trying to open an Excel workbook.
   */
  public static final ErrorCode UNABLE_TO_OPEN_EXCEL_WORKBOOK;

  /**
   * Exceptions with this error code are thrown when an exception occurs when trying to close an Excel workbook.
   */
  public static final ErrorCode UNABLE_TO_CLOSE_EXCEL_WORKBOOK;

  /**
   * Exceptions with this error code are thrown if class info is missing in the provided Excel workbook.
   */
  public static final ErrorCode CLASS_INFO_SHEET_MISSING;

  /**
   * Exceptions with this error code are thrown if a new XML document could not be created.
   */
  public static final ErrorCode UNABLE_TO_CREATE_XML_DOCUMENT;

  /**
   * Exceptions with this error code are thrown if a new XML document could not be created.
   */
  public static final ErrorCode NO_MESSAGE_DATA_IN_WORKBOOK;

  /**
   * Exceptions with this error code are thrown if a required column in message data is missing.
   */
  public static final ErrorCode INVALID_MESSAGE_DATA;

  /**
   * Exceptions with this error code are thrown if values for one or more required fields are missing.
   */
  public static final MessageID IGNORING_ROW;

  /**
   * Exceptions with this error code are thrown if a message ID is used multiple times.
   */
  public static final ErrorCode MESSAGE_ID_NOT_UNIQUE;

  /**
   * Exceptions with this error code are thrown if a message name is used multiple times.
   */
  public static final ErrorCode MESSAGE_NAME_NOT_UNIQUE;

  /**
   * Exceptions with this error code are thrown if a message name is used multiple times.
   */
  public static final MessageID IGNORING_EMPTY_SHEET;

  /**
   * JEAF Generator expects a specific version of the so called JEAF Meta Model (JMM). The JMM version that is used by
   * your UML model seems to be outdated. Please upgrade to latest version of JMM.
   */
  public static final ErrorCode INVALID_JMM;

  /**
   * When working with OpenAPI and REST there are some restrictions concerning the data types that can be used in Java.
   * This warning tells you that in a specific REST operation a incompatible parameter or return type is used. This will
   * lead to an invalid request / response from an OpenAPI perspective.
   */
  public static final ErrorCode INCOMPATIBLE_OPENAPI_TYPE;

  /**
   * Depending on how you export XMI files from your MagicDraw UML model, it might happen that the files contain
   * information about file systems paths. This should not be an issue on the machine where you exported the files.
   * However, it may lead to problems on other devices or your CI/CD infrastructure where file system paths might not be
   * the same.
   */
  public static final ErrorCode LOCAL_FILE_PATH_IN_XMI;

  /**
   * When working with OpenAPI and REST there are some restrictions concerning the data types that can be used in Java.
   * This warning tells you that in a defined «BeanParam» at least one property uses an incompatible type. This will
   * lead to an invalid request / response from an OpenAPI perspective.
   */
  public static final ErrorCode INCOMAPTIBLE_TYPE_IN_BEAN_PARAM;

  /**
   * When defining the path of a REST resource then the path that is defined on the «RESTResource» (not «RESTOperation»)
   * must start with a '/'
   */
  public static final ErrorCode INVALID_REST_RESOURCE_PATH;

  /**
   * The resource path of an «RESTOperation» is the combination of the path of the «RESTResource» and the
   * «RESTOperation». However at least one of them has to be defined.
   */
  public static final ErrorCode NO_REST_RESOURCE_PATH;

  /**
   * The path of a «RESTOperation» must not start with '/'.
   */
  public static final ErrorCode INVALID_REST_OPERSTION_PATH;

  /**
   * Each «RESTOperation» must define at least one HTTP method. If this message occurs then you have to fix your UML
   * model.
   */
  public static final ErrorCode NO_HTTP_METHOD_DEFINED;

  /**
   * The «RESTOperation» uses a HTTP status code that is not compatible with JAX-RS standard.
   */
  public static final ErrorCode INVALID_HTTP_STATUS_CODE;

  /**
   * The supported consumed media types can either be defined on the «RESTResource» or on the «RESTOperation» but at
   * least on one of them the information has to be defined.
   */
  public static final ErrorCode NO_CONSUMED_MEDIA_TYPE_DEFINED;

  /**
   * The produced media types can either be defined on the «RESTResource» or on the «RESTOperation» but at least on one
   * of them the information has to be defined.
   */
  public static final ErrorCode NO_PRODUCED_MEDIA_TYPE_DEFINED;

  /**
   * All input parameters of a «RESTOperation» must have a name. Please fix the issue in your UML model.
   */
  public static final ErrorCode REST_INPUT_PARAM_WITHOUT_NAME;

  /**
   * All input parameters that are not explicitly marked as «HeaderParam», «PathParam», «BeanParam» etc. are treated as
   * body. However REST only supports one body per request. So please ensure that there is not more than 1 body per
   * request.
   */
  public static final ErrorCode MULTIPLE_REQUEST_BODIES;

  /**
   * A «RESTOperation» defines a body parameter, however it's HTTP method does not allow to use a body.
   */
  public static final ErrorCode REQUEST_BODY_NOT_ALLOWED;

  /**
   * It's not allowed to have more than 1 global error response for an OpenAPI specification in an UML model.
   */
  public static final ErrorCode MORE_THAN_ONE_GLOBAL_ERROR_RESPONSE;

  /**
   * «OpenAPIResponse» types need to define exactly one response type
   */
  public static final ErrorCode TO_MANY_OPEN_API_RESPONSE_TYPES;

  /**
   * «OpenAPIDataType» must have 1 property as long as they are not modeled as composite data types.
   */
  public static final ErrorCode OPEN_API_DATA_TYPE_TOO_MANY_PROPERTIES;

  /**
   * «OpenAPIDataType» must only have primitive types of properties, as long as they are not modeled as composite data
   * types.
   */
  public static final ErrorCode OPEN_API_DATA_TYPE_ONLY_PRIMITIVES;

  /**
   * «OpenAPIDataType» must not have multi valued properties, as long as they are not modeled as composite data types.
   */
  public static final ErrorCode OPEN_API_DATA_TYPE_NO_MULTIVALUED_PROPERTIES;

  /**
   * «OpenAPIDataType» must not have parent classes.
   */
  public static final ErrorCode OPEN_API_DATA_TYPE_PARENT_NOT_SUPPORTED;

  /**
   * When defining a «PathParam» for a «RESTOperation» it is required that path parameters are required.
   */
  public static final ErrorCode PATH_PARAM_MUST_BE_REQUIRED;

  /**
   * «PathParam» must not be defined as multi valued in the UML model.
   */
  public static final ErrorCode PATH_PARAM_MUST_NOT_BE_MULTIVALUED;

  /**
   * It is strongly recommended that the elements of the UML model have a meaningful documentation ;-)
   */
  public static final ErrorCode DOCUMENTATION_MISSING;

  /**
   * When working with so called composite data types then inheritance is not supported for them.
   */
  public static final ErrorCode NO_PARENT_FOR_COMPOSITE_DATA_TYPES;

  /**
   * When modeling attributes in UML it is important that they also have a type. If a type is not defined then code
   * generation is not possible.
   */
  public static final ErrorCode ATTRIBUTE_WITHOUT_TYPE;

  /**
   * When modeling attributes and associations then it is required that they also have a type. If it is not defined then
   * code generation is not possible.
   */
  public static final ErrorCode PROPERTY_WITHOUT_NAME;

  /**
   * When modeling operations of services it is required that they also have a return type. Also case "void" has to be
   * defined in UML model. In addition multi valued primitive types are not supported as return types.
   */
  public static final ErrorCode INVALID_SERVICE_RETURN_TYPE;

  /**
   * When modeling parameters of operations it is required that they also have a name. If there are input parameters
   * without a name then code generation is not possible.
   */
  public static final ErrorCode INPUT_PARAMS_WITHOUT_NAME;

  /**
   * When modeling methods also a return type is required not only for methods that really return something but also in
   * case of "void". If a method does not define a return type then code generation is not possible.
   */
  public static final ErrorCode METHOD_WITHOUT_RETURN_TYPE;

  /**
   * When modeling method then they also have to have a name. Otherwise code generation is not possible.
   */
  public static final ErrorCode METHOD_WITHOUT_NAME;

  /**
   * All parameters within the UML model need to have a type. Otherwise code generation is not possible.
   */
  public static final ErrorCode PARAM_WITHOUT_TYPE;

  /**
   * When modeling activities you have to ensure that each «JEAFActivity» does not have more than one return parameter.
   */
  public static final ErrorCode ONLY_ONE_RETURN_PARAM_PER_ACTIVITY;

  /**
   * When modeling «JEAFComponents» you have to ensure that each component has defined a layer.
   */
  public static final ErrorCode NO_LAYER_DEFINED;

  /**
   * Class that are modeled as «PersistentObject» must have a so called "class id" with a value greater zero.
   */
  public static final ErrorCode NO_VALID_CLASS_ID;

  /**
   * When modeling persistent classes and their associations it is required that either both ends of an association have
   * applied stereotype «Role» or none of them.
   */
  public static final ErrorCode STEREOTYPE_ROLE_NOT_SET_ON_BOTH_ENDS;

  /**
   * When modeling associations between classes then it is required that navigable associations ends have set a role
   * name. Otherwise code generation is not possible.
   */
  public static final ErrorCode NO_ROLE_NAME_FOR_ASSOCIATION;

  /**
   * «ObjectMapping» is invalid according to the error message
   */
  public static final ErrorCode INVALID_OBJECT_MAPPING;

  /**
   * Minimum value for for Java Bean Validation «DecimalMin» is missing.
   */
  public static final ErrorCode DECIMAL_MIN_VALUE_MISSING;

  /**
   * For a specific Java Bean Validation a string-based or numeric target type is expected.
   */
  public static final ErrorCode WRONG_TARGET_TYPE_STRING_OR_NUMBER;

  /**
   * Maximum value for for Java Bean Validation «DecimalMax» is missing.
   */
  public static final ErrorCode DECIMAL_MAX_VALUE_MISSING;

  /**
   * For a specific Java Bean Validation a numeric target type is expected.
   */
  public static final ErrorCode WRONG_TARGET_TYPE_NUMBER;

  /**
   * When working with Java Bean Validation «Digit» then the integral and fractional digits have to be defined properly.
   */
  public static final ErrorCode WRONG_INTEGER_DIGITS;

  /**
   * When working with Java Bean Validation «Digit» then the integral and fractional digits have to be defined properly.
   */
  public static final ErrorCode WRONG_FRACTIONAL_DIGITS;

  /**
   * When working with Java Bean Validation «Size» then its minimal size has to be set properly.
   */
  public static final ErrorCode INVALID_SIZE_MIN;

  /**
   * When working with Java Bean Validation «Size» then its maximum size has to be set properly.
   */
  public static final ErrorCode INVALID_SIZE_MAX;

  /**
   * When working with Java Bean Validation «Size» maximum size has to be greater or equal to minimum size.
   */
  public static final ErrorCode INVALID_MAX_MIN_SIZE;

  /**
   * When working with Java Bean Validation «Size» then at least minimum or maximum size has to be set.
   */
  public static final ErrorCode EITHER_MIN_OR_MAX_HAS_TO_BE_SET;

  /**
   * For a specific Java Bean Validation a string, collection and map target type is expected.
   */
  public static final ErrorCode WRONG_TYPE_CHAR_OR_CONTAINER;

  /**
   * When working with Java Bean Validation «Pattern» then a regexp pattern has to be set.
   */
  public static final ErrorCode REGEXP_PATTERN_MISSING;

  /**
   * For a specific Java Bean Validation a string target type is expected.
   */
  public static final ErrorCode WRONG_TYPE_CHAR;

  /**
   * For a specific Java Bean Validation a boolean target type is expected.
   */
  public static final ErrorCode WRONG_TYPE_BOOLEAN;

  /**
   * For a specific Java Bean Validation a date target type is expected.
   */
  public static final ErrorCode WRONG_TYPE_DATE;

  /**
   * Special stereotype «Ignore» can be used to explicitly exclude model elements from code generation. However this
   * mechanism is intended to be a workaround / short term solution and not a permanent one ;-). Proper solution to this
   * is to clean up your UML model. That's why a warning is shown during code generation.
   */
  public static final ErrorCode IGNORED_ELEMENT;

  /**
   * OpenAPI standard defines that for whatever reason some header fields should not be mentioned in the OpenAPI
   * specification e.g. ''Authorization'' header. However from an overall perspective it still might make sense to
   * explicitly model them e.g. if these fields are still required in Java code. Putting it all together in very most
   * cases this warning can be ignored and is only generated to emphasis that these headers did not get "forgotten" in
   * generation of OpenAPI specification but are not added by intention. For further details please also refer to
   * https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.3.md#parameterObject
   */
  public static final ErrorCode IGNOREABLE_OPEN_API_HEADER_FOUND;

  /**
   * JEAF Generator supports to mark various elements in the UML model as deprecated. This information is also added to
   * the generated code and OpenAPI specification. However, there are cases where OpenAPI does not allow to mark an
   * element as deprecated. Namely this is the case for single valued references to other complex types like a 0..1
   * association to another object. In this case the generated Java code will still contain the deprecation but the
   * OpenAPI specification will not have "deprecation: true". Instead only as comment inside the file is created.
   *
   * Example: - # Property "xyz" is marked as deprecated. However OpenAPI does not support to mark references to complex
   * types as deprecated.
   */
  public static final ErrorCode DEPRECATION_MARKING_NOT_ALLOWED;

  /**
   * JAX-RS specification only allows to use java.util.List, java.util.Set or java.util.SortedSet for header params but
   * not java.util.Collection. Please fix your UML model so that either List, Set or SortedSet is used for multi valued
   * header fields.
   */
  public static final ErrorCode COLLECTION_HEADER_PARAM_NOT_SUPPORTED;

  /**
   * JAX-RS specification only allows to use java.util.List, java.util.Set or java.util.SortedSet for query params but
   * not java.util.Collection. Please fix your UML model so that either List, Set or SortedSet is used for multi valued
   * query params.
   */
  public static final ErrorCode COLLECTION_QUERY_PARAM_NOT_SUPPORTED;

  /**
   * JEAF Generator supports to also make the public representation of a composite data type visible internally. To do
   * so, a property has to be marked with stereotype «CompositeDataTypePublicField». In addition it is required that the
   * property is of type String.
   */
  public static final ErrorCode COMPOSITE_DATA_TYPE_PUBLIC_FIELD_MUST_BE_STRING;

  /**
   * JEAF Generator supports so called soft links. They can be used to modularize your model without loosing information
   * about real types. One possibility when using soft links is to use so called custom generic soft links. In this case
   * you can define your own type that should be used to represent the soft link association. This type, however has to
   * be configured in JEAF Generator Maven Plugin.
   */
  public static final ErrorCode CUSTOM_GENERIC_TYPE_NOT_CONFIGURED;

  /**
   * JEAF Generator supports so called OpenAPI Data Types. They can be used a strong type representation for basic
   * types. For OpenAPI Data Types it is strongly recommended that they are immutable.
   */
  public static final ErrorCode OPEN_API_DATA_TYPE_NOT_IMMUTABLE;

  /**
   * And model element can either be marked with stereotype «POJO» or «ServiceObject» but not both of them a the same
   * time.
   */
  public static final ErrorCode EITHER_POJO_OR_SERVICE_OBJECT;

  /**
   * If a model element is marked as deprecated also a description, a "since" flag and the planned removal date of the
   * deprecation should be provided so that consumers of the classes, services etc. can prepare.
   */
  public static final ErrorCode INCOMPLETE_DEPRECATION;

  /**
   * If a model element is marked as composite data type then a name for the public field representation is required to
   * be set in the model.
   */
  public static final ErrorCode NO_PUBLIC_FIELD_NAME_FOR_COMPOSITE_DATA_TYPE;

  /**
   * In case that a class has one or more non-transient bidirectional associations it is not possible to generate
   * equals() and hashCode() as it requires some business knowledge to do so. If equals() and hashCode() are required
   * for such a class then it has to be implemented manually.
   */
  public static final ErrorCode NO_EQUALS_FOR_BIDIRECTIONAL_ASSOCIATIONS;

  /**
   * JEAF Generator supports so called soft links. They can be used to modularize and decouple your application. Due to
   * that it does not make sense to use them in combination with bidirectional associations.
   */
  public static final ErrorCode SOFTLINK_FOR_BIDIRECTIONAL_ASSOCIATION_NOT_SUPPORTED;

  /**
   * A REST operation path defines one or more path params but not all of them are also present as parameters in the
   * defined REST operation
   */
  public static final ErrorCode PATH_PARAMS_MISSING;

  /**
   * A REST operation defines path parameters that are not defined on the operations paths as parameters
   */
  public static final ErrorCode DEAD_PATH_PARAMS;

  /**
   * JEAF Generator supports usage of so called Template Bindings in UML which are an equivalent to generics in Java. If
   * a class makes usage of such a template binding then also a parameter substitution has to be defined in the UML
   * model.
   */
  public static final ErrorCode INVALID_TEMPLATE_BINDING_NO_SUBST;

  /**
   * JEAF Generator supports usage of so called Template Bindings in UML which are an equivalent to generics in Java.
   * However in UML it is possible to define more than one template binding per class. This is currently not supported
   * by JEAF Generator.
   */
  public static final ErrorCode TOO_MANY_TEMPLATE_BINDINGS;

  /**
   * Enumerations might have mandatory properties without default values. If an enumeration literal is defined in the
   * UML model and not all mandatory properties without default value are set, then this error message will be used.
   */
  public static final ErrorCode MANDATORY_ENUM_PROPERTIES_NOT_SET;

  /**
   * Names of classes, enumerations, properties, parameters and operations must match to regular expression according to
   * Java Language Specification.
   */
  public static final ErrorCode INVALID_IDENTIFIER_NAME;

  /**
   * JEAF Generator supports to split a model into several OpenAPI specifications. If in such a case one OpenAPI
   * specification refers to the types of another one, then a dependency between OpenAPI specs has to be defined in the
   * UML model. If you want you can disable this check using configuration parameter `disableOpenAPIDependencyChecks`.
   * However, please be aware that not checking dependencies might lead to inconsistent or incorrect OpenAPI
   * specifications.
   */
  public static final ErrorCode OPEN_API_SPEC_REFERENCE_MISSING;

  /**
   * When working with OpenAPI specifications then all complex types that are used must belong to an OpenAPI
   * specification. Please make sure that OpenAPI types only use basic types or other OpenAPI types that belong to an
   * OpenAPI specification (same or referenced one).
   */
  public static final ErrorCode ORPHANED_OPEN_API_TYPE_USED;

  /**
   * JEAF Generator supports developers with special code generation for backward compatibility for Java properties. Due
   * to that tagged value ''generateBackwardCompatibility'' and ''successorName'' of stereotype «JEAFDeprecated» can
   * only be used for properties.
   */
  public static final ErrorCode BACKWARD_COMPATIBILITY_ONLY_APPLICABLE_FOR_PROPERTIES;

  /**
   * JEAF Generator support developers with special code generation for backward compatibility for Java properties.
   * Therefore it is possible to define the successor of an already existing property. The name of the successor must
   * match to a real property of the same class.
   */
  public static final ErrorCode SUCCESSOR_DOES_NOT_EXIST;

  /**
   * JEAF Generator support developers with special code generation for backward compatibility for Java properties.
   * Therefore it is possible to define the successor of an already existing property. The name of the successor must be
   * set.
   */
  public static final ErrorCode SUCCESSOR_NOT_SET;

  /**
   * JEAF Generator supports to generate NotNull / NotEmpty annotations based on the UML model information for
   * properties and parameters. However, in Java there is no really default which annotatrion to use. So, JEAF Generator
   * explicitly expects that the name of the annotation that should be used is defined in the Maven configuration.
   */
  public static final ErrorCode NOT_NULL_ANNOTATION_NAME_NOT_SET;

  /**
   * When modeling parameters of methods in UML it is important that they also have a type. If a type is not defined
   * then code generation is not possible.
   */
  public static final ErrorCode PARAMETER_WITHOUT_TYPE;

  /**
   * JEAF Generator detected that there is a class with a broken template binding. Please make sure that for every
   * template parameter substitution there also is a actual type defined in the UML model.
   */
  public static final ErrorCode BROKEN_TEMPLATE_BINDING;

  /**
   * JEAF Generator detected that there is an optional primitive property without explicit default value in a class with
   * stereotype «POJO» or «ServiceObject». This check was excplitily enabled in your Maven configuration using
   * configuration parameter "enforceExplicitDefaultValueForOptionalPrimitives".
   */
  public static final ErrorCode PROPERTY_WITH_OPTIONAL_PRIMITIVE;

  /**
   * JEAF Generator detected that there is an optional primitive parameter without explicit default value in an
   * operation with stereotype «RESTOperation». This check was excplitily enabled in your Maven configuration using
   * configuration parameter "enforceExplicitDefaultValueForOptionalPrimitives".
   */
  public static final ErrorCode OPERATION_WITH_OPTIONAL_PRIMITIVE;

  /**
   * JEAF Generator supports to define depenencies between elements. As this information is used to generate Maven POM
   * files source and target of such dependencies must be elements with stereotype «MavenProject».
   */
  public static final ErrorCode INVALID_SOURCE_OR_TARGET_FOR_MVN_DEPENDENCY;

  /**
   * JEAF Generator supports to use UML model coordinates from parent POM (direct or indirect). However there the
   * coordinates of the UML model have to be defined.
   */
  public static final ErrorCode NO_MODEL_COORDINATES_IN_PARENT;

  /**
   * Stereotype «MavenDependency» can only be used if the target Maven project is of archetype "ARTIFACT".
   */
  public static final ErrorCode TARGET_PROJECT_HAS_WRONG_ARCHETYPE;

  /**
   * Tag "serviceTypes" is only applicable for Maven projects with archetype "SERVICE_MODEL".
   */
  public static final ErrorCode SERVICE_TYPES_ONLY_APPLICABLE_FOR_SERVICE_MODELS;

  /**
   * When there is a Maven project dependency in the UML model then the so called module dependency type must match to
   * the projects archetype.
   */
  public static final ErrorCode ARCHETYPE_DO_NOT_MATCH_TO_DEPNDENCY_TYPE;

  /**
   * When working with bean parameters, it is generally expected that every property of a bean parameter class
   * represents a header, path, query, or cookie parameter. In cases where a bean parameter class also includes simple
   * properties for other purposes, those properties must be explicitly marked as “not a REST parameter” using
   * stereotype «NoRESTParam».
   */
  public static final ErrorCode BEAN_PARAM_PROPERTY_WITHOUT_PARAM_TYPE;

  /**
   * So called compatibility groups can be used to simplify handling of deprecation and breaking changes message. One
   * part of this is defining compatibility info for a compatibility group. However you can not define more the one
   * compatibility info for a compatibility group
   */
  public static final ErrorCode TOO_MANY_COMPATIBILITY_INFOS;

  /**
   * It is possible to define the first incompatible version for a version. However, as the name implies, there is only
   * one first incompatible first version.
   */
  public static final ErrorCode TOO_MANY_INCOMPATIBLE_VERSIONS;

  /**
   * Using stereotype «EnumSubset» it is possible to limit the allowed literals for a property. This can be achieved by
   * either using a positive or an exclusion list but not both or none.
   */
  public static final ErrorCode ENUM_SUBSET_INVALID;

  /**
   * Using stereotype «EnumSubset» it is possible to limit the allowed literals for a property. This can be achieved by
   * either using a positive or an exclusion list but not both or none.
   */
  public static final ErrorCode ENUM_SUBSET_NOT_DEFINED;

  /**
   * Model elements can be associated with «CompatibilityGroup» elements. However, at least at the moment more than one
   * compatibioity group is not supported.
   */
  public static final ErrorCode MORE_THAN_ONE_COMPATIBILIY_GROUP;

  /**
   * «CompatibilityGroup» elements always must have exactly one «CompatibilityInfo».
   */
  public static final ErrorCode COMPATIBILITY_GROUP_HAS_NO_INFO;

  /**
   * Multiple inheritance is not supported by Java or OpenAPI.
   */
  public static final ErrorCode MULTIPLE_INHERITANCE;

  /**
   * JEAF Generator currently does not support inheritance in combination with Java Generics
   */
  public static final ErrorCode GENERIC_INHERITANCE;

  /**
   * When using JEAF Generator it is possible to define an OpenAPI namespace. OpenAPI itself does not provide a built-in
   * concept of namespaces. For a given namespace, JEAF Generator ensures that all schema element names are unique
   * within that scope.
   *
   * This is particularly useful when the generated OpenAPI specifications are consumed by code generation tools other
   * than the JEAF Generator. Many code generators do not support assigning separate packages when working with multiple
   * OpenAPI specifications. In such scenarios, it is essential that all schema elements have unique names to avoid
   * naming conflicts during code generation.
   */
  public static final ErrorCode DUPLICATED_NAME_IN_OPENAPI_NAMESPACE;

  /**
   * JEAF Generator supports to split a model into several OpenAPI specifications. If in such a case one OpenAPI
   * specification refers to the types of another one, then a dependency between OpenAPI specs has to be defined in the
   * UML model. If you want you can disable this check using configuration parameter `disableOpenAPIDependencyChecks`.
   * However, please be aware that not checking dependencies might lead to inconsistent or incorrect OpenAPI
   * specifications.
   */
  public static final ErrorCode OPEN_API_SPEC_REFERENCE_MISSING_FOR_INHERITANCE;

  /**
   * Links from associations to compatibility groups are not supported. Instead, the property of the association end
   * must define the dependency on the compatibility group.
   */
  public static final ErrorCode COMPATIBILITY_GROUP_REFERENCED_BY_ASSOCIATION;

  /**
   * JEAF Generator supports developers with special code generation for backward compatibility of Java properties. For
   * this purpose, the successor of an existing property can be defined. The deprecated property and its successor must
   * have the same type and multiplicity.
   */
  public static final ErrorCode DEPRECATED_PROPERTY_AND_SUCCESSOR_DO_NOT_HAVE_SAME_TYPE;

  /**
   * Each release of the JEAF Meta Model (JMM) defines the minimum version of JEAF Generator that supports it. Your UML
   * model uses a JMM version that is newer than the JEAF Generator version you are using. Please upgrade JEAF Generator
   * to the required version or higher.
   */
  public static final ErrorCode INCOMPATIBLE_GENERATOR_VERSION;

  /**
   * Deprecated types whose compatibility group does not belong to the OpenAPI validation group are not part of OpenAPI
   * specifications. If an element of an OpenAPI specification still references such a type, the specification would
   * contain an unresolved reference.
   */
  public static final ErrorCode TYPE_EXCLUDED_FROM_OPENAPI;

  /**
   * The path of the operations of a REST resource is either defined by tagged value `path` or by `operationPathPrefix`.
   * Both must not be set at the same time.
   */
  public static final ErrorCode REST_RESOURCE_PATH_AND_PREFIX;

  /**
   * Stereotypes «OpenAPIType», «OpenAPIDataType» and «BeanParam» define different kinds of types. A class can only be
   * one of them.
   */
  public static final ErrorCode CONFLICTING_OPENAPI_STEREOTYPES;

  /**
   * Stereotypes «PathParam», «QueryParam», «HeaderParam» and «CookieParam» are only evaluated for parameters of a
   * «RESTOperation» and properties of a «BeanParam». On other elements they have no effect.
   */
  public static final ErrorCode REST_PARAM_NOT_APPLICABLE;

  /**
   * REST operations are generated based on the JEAF service they belong to. Therefore the interface that owns a
   * «RESTOperation» has to be a «JEAFService».
   */
  public static final ErrorCode REST_OPERATION_WITHOUT_SERVICE;

  /**
   * REST resources are generated based on the JEAF service they represent. Therefore each «RESTResource» also has to be
   * marked as «JEAFService».
   */
  public static final ErrorCode REST_RESOURCE_WITHOUT_SERVICE;

  /**
   * A «BeanParam» groups path, query, header or cookie parameters of REST operations. If none of its properties is such
   * a parameter, the bean parameter has no effect on the REST interface.
   */
  public static final ErrorCode BEAN_PARAM_WITHOUT_REST_PARAMS;

  /**
   * Path, query, header and cookie parameters are transferred as strings. Therefore only basic types, enumerations,
   * «OpenAPIDataType» and composite data types can be used as their type.
   */
  public static final ErrorCode UNSUPPORTED_REST_PARAM_TYPE;

  /**
   * JEAF Generator only supports default values for single-valued properties.
   */
  public static final ErrorCode DEFAULT_VALUE_FOR_MULTIVALUED_PROPERTY;

  /**
   * The default value of a property has to match its type: numeric types require a valid number, booleans `true` or
   * `false` and enumerations the name of one of their literals. Otherwise invalid code would be generated.
   */
  public static final ErrorCode INVALID_DEFAULT_VALUE;

  /**
   * Stereotype «EnumSubset» restricts the allowed literals of an enumeration. It can only be applied to properties and
   * parameters whose type is an enumeration.
   */
  public static final ErrorCode ENUM_SUBSET_WITHOUT_ENUMERATION;

  /**
   * An abstract class can not be instantiated and a final class (`isLeaf`) can not be extended. Therefore a class
   * should not be both.
   */
  public static final ErrorCode ABSTRACT_AND_FINAL_CLASS;

  /**
   * Operations without return value have to use type `void` of the MagicDraw profile (`MagicDraw
   * Profile.datatypes.void`). Other types named `void` are not recognized and would lead to invalid code.
   */
  public static final ErrorCode INVALID_VOID_TYPE;

  /**
   * The identifiers of validation groups have to be unique within a UML model.
   */
  public static final ErrorCode VALIDATION_GROUP_IDENTIFIER_NOT_UNIQUE;

  /**
   * Only one validation group can be used for OpenAPI specifications. Therefore tagged value `openAPIValidationGroup`
   * may only be set for one «ValidationGroup».
   */
  public static final ErrorCode MULTIPLE_OPENAPI_VALIDATION_GROUPS;

  /**
   * Stereotype «FirstIncompatibleVersion» defines the first incompatible version between two «CompatibilityInfo»
   * elements. On other dependencies it has no effect.
   */
  public static final ErrorCode INVALID_FIRST_INCOMPATIBLE_VERSION;

  /**
   * If a literal of an enumeration defines a slot for an attribute, then the slot also has to define a value.
   */
  public static final ErrorCode ENUM_LITERAL_SLOT_WITHOUT_VALUE;

  /**
   * All types and parameters that are used by an OpenAPI specification have to be resolvable while it is generated.
   * Otherwise the generated OpenAPI specification would be incomplete.
   */
  public static final ErrorCode UNRESOLVED_OPENAPI_REFERENCE;

  /**
   * The dependencies between OpenAPI specifications («OpenAPISpecReference») are circular. JEAF Generator supports
   * this, but circular dependencies make OpenAPI specifications harder to understand and to use, e.g. for tools that
   * process the specifications one after the other. Consider to move shared types into a separate specification.
   */
  public static final ErrorCode OPENAPI_SPEC_CIRCULAR_DEPENDENCY;

  /**
   * A package belongs to an OpenAPI specification through a dependency from the «OpenAPI3Specification» to the package.
   * If several OpenAPI specifications have a dependency to the same package, it is undefined in which specification its
   * types are generated. Keep the dependency of only one OpenAPI specification to the package.
   */
  public static final ErrorCode PACKAGE_IN_SEVERAL_OPENAPI_SPECS;
  /**
   * Static initializer contains initialization for all generated constants.
   */
  static {
    MessageRepository lRepository = XFun.getMessageRepository();
    lRepository.loadResource(MESSAGE_RESOURCE);
    // Handle all info messages.
    IGNORING_ROW = lRepository.getMessageID(9010);
    IGNORING_EMPTY_SHEET = lRepository.getMessageID(9013);
    // Handle all messages for errors.
    STYLESHEET_NOT_AVAILABLE = lRepository.getErrorCode(9000);
    UNABLE_TO_CREATE_DIR = lRepository.getErrorCode(9001);
    UNABLE_TO_PERFORM_TRANSFORMATION = lRepository.getErrorCode(9002);
    INVALID_CLASS_INFO = lRepository.getErrorCode(9003);
    UNABLE_TO_OPEN_EXCEL_WORKBOOK = lRepository.getErrorCode(9004);
    UNABLE_TO_CLOSE_EXCEL_WORKBOOK = lRepository.getErrorCode(9005);
    CLASS_INFO_SHEET_MISSING = lRepository.getErrorCode(9006);
    UNABLE_TO_CREATE_XML_DOCUMENT = lRepository.getErrorCode(9007);
    NO_MESSAGE_DATA_IN_WORKBOOK = lRepository.getErrorCode(9008);
    INVALID_MESSAGE_DATA = lRepository.getErrorCode(9009);
    MESSAGE_ID_NOT_UNIQUE = lRepository.getErrorCode(9011);
    MESSAGE_NAME_NOT_UNIQUE = lRepository.getErrorCode(9012);
    INVALID_JMM = lRepository.getErrorCode(9100);
    INCOMPATIBLE_OPENAPI_TYPE = lRepository.getErrorCode(9101);
    LOCAL_FILE_PATH_IN_XMI = lRepository.getErrorCode(9102);
    INCOMAPTIBLE_TYPE_IN_BEAN_PARAM = lRepository.getErrorCode(9103);
    INVALID_REST_RESOURCE_PATH = lRepository.getErrorCode(9104);
    NO_REST_RESOURCE_PATH = lRepository.getErrorCode(9105);
    INVALID_REST_OPERSTION_PATH = lRepository.getErrorCode(9106);
    NO_HTTP_METHOD_DEFINED = lRepository.getErrorCode(9107);
    INVALID_HTTP_STATUS_CODE = lRepository.getErrorCode(9108);
    NO_CONSUMED_MEDIA_TYPE_DEFINED = lRepository.getErrorCode(9109);
    NO_PRODUCED_MEDIA_TYPE_DEFINED = lRepository.getErrorCode(9110);
    REST_INPUT_PARAM_WITHOUT_NAME = lRepository.getErrorCode(9111);
    MULTIPLE_REQUEST_BODIES = lRepository.getErrorCode(9112);
    REQUEST_BODY_NOT_ALLOWED = lRepository.getErrorCode(9113);
    MORE_THAN_ONE_GLOBAL_ERROR_RESPONSE = lRepository.getErrorCode(9114);
    TO_MANY_OPEN_API_RESPONSE_TYPES = lRepository.getErrorCode(9115);
    OPEN_API_DATA_TYPE_TOO_MANY_PROPERTIES = lRepository.getErrorCode(9116);
    OPEN_API_DATA_TYPE_ONLY_PRIMITIVES = lRepository.getErrorCode(9117);
    OPEN_API_DATA_TYPE_NO_MULTIVALUED_PROPERTIES = lRepository.getErrorCode(9118);
    OPEN_API_DATA_TYPE_PARENT_NOT_SUPPORTED = lRepository.getErrorCode(9119);
    PATH_PARAM_MUST_BE_REQUIRED = lRepository.getErrorCode(9120);
    PATH_PARAM_MUST_NOT_BE_MULTIVALUED = lRepository.getErrorCode(9121);
    DOCUMENTATION_MISSING = lRepository.getErrorCode(9122);
    NO_PARENT_FOR_COMPOSITE_DATA_TYPES = lRepository.getErrorCode(9123);
    ATTRIBUTE_WITHOUT_TYPE = lRepository.getErrorCode(9124);
    PROPERTY_WITHOUT_NAME = lRepository.getErrorCode(9125);
    INVALID_SERVICE_RETURN_TYPE = lRepository.getErrorCode(9126);
    INPUT_PARAMS_WITHOUT_NAME = lRepository.getErrorCode(9127);
    METHOD_WITHOUT_RETURN_TYPE = lRepository.getErrorCode(9128);
    METHOD_WITHOUT_NAME = lRepository.getErrorCode(9129);
    PARAM_WITHOUT_TYPE = lRepository.getErrorCode(9130);
    ONLY_ONE_RETURN_PARAM_PER_ACTIVITY = lRepository.getErrorCode(9131);
    NO_LAYER_DEFINED = lRepository.getErrorCode(9132);
    NO_VALID_CLASS_ID = lRepository.getErrorCode(9133);
    STEREOTYPE_ROLE_NOT_SET_ON_BOTH_ENDS = lRepository.getErrorCode(9134);
    NO_ROLE_NAME_FOR_ASSOCIATION = lRepository.getErrorCode(9135);
    INVALID_OBJECT_MAPPING = lRepository.getErrorCode(9136);
    DECIMAL_MIN_VALUE_MISSING = lRepository.getErrorCode(9137);
    WRONG_TARGET_TYPE_STRING_OR_NUMBER = lRepository.getErrorCode(9138);
    DECIMAL_MAX_VALUE_MISSING = lRepository.getErrorCode(9139);
    WRONG_TARGET_TYPE_NUMBER = lRepository.getErrorCode(9140);
    WRONG_INTEGER_DIGITS = lRepository.getErrorCode(9141);
    WRONG_FRACTIONAL_DIGITS = lRepository.getErrorCode(9142);
    INVALID_SIZE_MIN = lRepository.getErrorCode(9143);
    INVALID_SIZE_MAX = lRepository.getErrorCode(9144);
    INVALID_MAX_MIN_SIZE = lRepository.getErrorCode(9145);
    EITHER_MIN_OR_MAX_HAS_TO_BE_SET = lRepository.getErrorCode(9146);
    WRONG_TYPE_CHAR_OR_CONTAINER = lRepository.getErrorCode(9147);
    REGEXP_PATTERN_MISSING = lRepository.getErrorCode(9148);
    WRONG_TYPE_CHAR = lRepository.getErrorCode(9149);
    WRONG_TYPE_BOOLEAN = lRepository.getErrorCode(9150);
    WRONG_TYPE_DATE = lRepository.getErrorCode(9151);
    IGNORED_ELEMENT = lRepository.getErrorCode(9152);
    IGNOREABLE_OPEN_API_HEADER_FOUND = lRepository.getErrorCode(9153);
    DEPRECATION_MARKING_NOT_ALLOWED = lRepository.getErrorCode(9154);
    COLLECTION_HEADER_PARAM_NOT_SUPPORTED = lRepository.getErrorCode(9155);
    COLLECTION_QUERY_PARAM_NOT_SUPPORTED = lRepository.getErrorCode(9156);
    COMPOSITE_DATA_TYPE_PUBLIC_FIELD_MUST_BE_STRING = lRepository.getErrorCode(9157);
    CUSTOM_GENERIC_TYPE_NOT_CONFIGURED = lRepository.getErrorCode(9158);
    OPEN_API_DATA_TYPE_NOT_IMMUTABLE = lRepository.getErrorCode(9159);
    EITHER_POJO_OR_SERVICE_OBJECT = lRepository.getErrorCode(9160);
    INCOMPLETE_DEPRECATION = lRepository.getErrorCode(9161);
    NO_PUBLIC_FIELD_NAME_FOR_COMPOSITE_DATA_TYPE = lRepository.getErrorCode(9162);
    NO_EQUALS_FOR_BIDIRECTIONAL_ASSOCIATIONS = lRepository.getErrorCode(9163);
    SOFTLINK_FOR_BIDIRECTIONAL_ASSOCIATION_NOT_SUPPORTED = lRepository.getErrorCode(9164);
    PATH_PARAMS_MISSING = lRepository.getErrorCode(9165);
    DEAD_PATH_PARAMS = lRepository.getErrorCode(9166);
    INVALID_TEMPLATE_BINDING_NO_SUBST = lRepository.getErrorCode(9167);
    TOO_MANY_TEMPLATE_BINDINGS = lRepository.getErrorCode(9168);
    MANDATORY_ENUM_PROPERTIES_NOT_SET = lRepository.getErrorCode(9169);
    INVALID_IDENTIFIER_NAME = lRepository.getErrorCode(9170);
    OPEN_API_SPEC_REFERENCE_MISSING = lRepository.getErrorCode(9171);
    ORPHANED_OPEN_API_TYPE_USED = lRepository.getErrorCode(9172);
    BACKWARD_COMPATIBILITY_ONLY_APPLICABLE_FOR_PROPERTIES = lRepository.getErrorCode(9173);
    SUCCESSOR_DOES_NOT_EXIST = lRepository.getErrorCode(9174);
    SUCCESSOR_NOT_SET = lRepository.getErrorCode(9175);
    NOT_NULL_ANNOTATION_NAME_NOT_SET = lRepository.getErrorCode(9176);
    PARAMETER_WITHOUT_TYPE = lRepository.getErrorCode(9177);
    BROKEN_TEMPLATE_BINDING = lRepository.getErrorCode(9178);
    PROPERTY_WITH_OPTIONAL_PRIMITIVE = lRepository.getErrorCode(9179);
    OPERATION_WITH_OPTIONAL_PRIMITIVE = lRepository.getErrorCode(9180);
    INVALID_SOURCE_OR_TARGET_FOR_MVN_DEPENDENCY = lRepository.getErrorCode(9181);
    NO_MODEL_COORDINATES_IN_PARENT = lRepository.getErrorCode(9182);
    TARGET_PROJECT_HAS_WRONG_ARCHETYPE = lRepository.getErrorCode(9183);
    SERVICE_TYPES_ONLY_APPLICABLE_FOR_SERVICE_MODELS = lRepository.getErrorCode(9184);
    ARCHETYPE_DO_NOT_MATCH_TO_DEPNDENCY_TYPE = lRepository.getErrorCode(9185);
    BEAN_PARAM_PROPERTY_WITHOUT_PARAM_TYPE = lRepository.getErrorCode(9186);
    TOO_MANY_COMPATIBILITY_INFOS = lRepository.getErrorCode(9187);
    TOO_MANY_INCOMPATIBLE_VERSIONS = lRepository.getErrorCode(9188);
    ENUM_SUBSET_INVALID = lRepository.getErrorCode(9189);
    ENUM_SUBSET_NOT_DEFINED = lRepository.getErrorCode(9190);
    MORE_THAN_ONE_COMPATIBILIY_GROUP = lRepository.getErrorCode(9191);
    COMPATIBILITY_GROUP_HAS_NO_INFO = lRepository.getErrorCode(9192);
    MULTIPLE_INHERITANCE = lRepository.getErrorCode(9193);
    GENERIC_INHERITANCE = lRepository.getErrorCode(9194);
    DUPLICATED_NAME_IN_OPENAPI_NAMESPACE = lRepository.getErrorCode(9195);
    OPEN_API_SPEC_REFERENCE_MISSING_FOR_INHERITANCE = lRepository.getErrorCode(9196);
    COMPATIBILITY_GROUP_REFERENCED_BY_ASSOCIATION = lRepository.getErrorCode(9197);
    DEPRECATED_PROPERTY_AND_SUCCESSOR_DO_NOT_HAVE_SAME_TYPE = lRepository.getErrorCode(9198);
    INCOMPATIBLE_GENERATOR_VERSION = lRepository.getErrorCode(9199);
    TYPE_EXCLUDED_FROM_OPENAPI = lRepository.getErrorCode(9200);
    REST_RESOURCE_PATH_AND_PREFIX = lRepository.getErrorCode(9201);
    CONFLICTING_OPENAPI_STEREOTYPES = lRepository.getErrorCode(9202);
    REST_PARAM_NOT_APPLICABLE = lRepository.getErrorCode(9203);
    REST_OPERATION_WITHOUT_SERVICE = lRepository.getErrorCode(9204);
    REST_RESOURCE_WITHOUT_SERVICE = lRepository.getErrorCode(9205);
    BEAN_PARAM_WITHOUT_REST_PARAMS = lRepository.getErrorCode(9206);
    UNSUPPORTED_REST_PARAM_TYPE = lRepository.getErrorCode(9207);
    DEFAULT_VALUE_FOR_MULTIVALUED_PROPERTY = lRepository.getErrorCode(9208);
    INVALID_DEFAULT_VALUE = lRepository.getErrorCode(9209);
    ENUM_SUBSET_WITHOUT_ENUMERATION = lRepository.getErrorCode(9210);
    ABSTRACT_AND_FINAL_CLASS = lRepository.getErrorCode(9211);
    INVALID_VOID_TYPE = lRepository.getErrorCode(9212);
    VALIDATION_GROUP_IDENTIFIER_NOT_UNIQUE = lRepository.getErrorCode(9213);
    MULTIPLE_OPENAPI_VALIDATION_GROUPS = lRepository.getErrorCode(9214);
    INVALID_FIRST_INCOMPATIBLE_VERSION = lRepository.getErrorCode(9215);
    ENUM_LITERAL_SLOT_WITHOUT_VALUE = lRepository.getErrorCode(9216);
    UNRESOLVED_OPENAPI_REFERENCE = lRepository.getErrorCode(9217);
    OPENAPI_SPEC_CIRCULAR_DEPENDENCY = lRepository.getErrorCode(9218);
    PACKAGE_IN_SEVERAL_OPENAPI_SPECS = lRepository.getErrorCode(9219);
    // Handle all localized strings.
  }

  /**
   * Constructor is private to ensure that no instances of this class will be created.
   */
  private ErrorCodes( ) {
    // Nothing to do.
  }
}