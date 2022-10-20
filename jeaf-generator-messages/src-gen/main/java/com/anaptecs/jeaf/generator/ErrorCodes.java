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
   * your UML Model seems to be outdated. Please upgrade to latest version of JMM.
   */
  public static final ErrorCode INVALID_JMM;

  /**
   * When working with OpenAPI and REST there are some restrictions concerning the data types that can be used in Java.
   * This warning tells you that in a specific REST operation a incompatible parameter or return type is used. This will
   * lead to an invalid request / response from an OpenAPI perspective.
   */
  public static final ErrorCode INCOMPATIBLE_OPENAPI_TYPE;

  /**
   * Depending on how you export XMI files from your MagicDraw model it might happen that the files contain information
   * about file systems paths. This should not be an issue on the machine where you exported the files. However, it may
   * lead to problems on other devices or your CI/CD infrastructure where file system paths might not be the same.
   */
  public static final ErrorCode LOCAL_FILE_PATH_IN_XMI;

  /**
   * When working with OpenAPI and REST there are some restrictions concerning the data types that can be used in Java.
   * This warning tells you that in a defined "BeanParam" at least one property uses an incompatible type. This will
   * lead to an invalid request / response from an OpenAPI perspective.
   */
  public static final ErrorCode INCOMAPTIBLE_TYPE_IN_BEAN_PARAM;
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
    // Handle all localized strings.
  }

  /**
   * Constructor is private to ensure that no instances of this class will be created.
   */
  private ErrorCodes( ) {
    // Nothing to do.
  }
}