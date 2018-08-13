package it.abd.esb.camel.alfresco.model;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "http://www.abd.it/esb/FirmaEMarcaRemota/signRemoteDTO")
@XmlRootElement(name = "signRemoteDTO")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class SignRemoteDTORequest {
	@XmlAttribute
	private String username;
	@XmlAttribute
	private String password;
	@XmlAttribute
	private String usernameWs;
	@XmlAttribute
	private String passwordWs;
	@XmlAttribute
	private String urlWs;
	@XmlAttribute
	private String otp;
	@XmlAttribute
	private byte[] hash;
	@XmlAttribute
	private boolean withTimestamp; 
	@XmlAttribute
	private boolean levelBes;
	@XmlAttribute
	private byte[] documento; 
	@XmlAttribute
	private boolean retrieveDocument;
	@XmlAttribute
	private boolean isAutomaticSign; 
	@XmlAttribute
	private boolean isCounterSign;
	@XmlAttribute
	private boolean isDetached;
	@XmlAttribute
	private boolean isOnlyHash;
	@XmlAttribute
	private String firmaRemotaUtils;
	@XmlAttribute
	private String utenteDelegante; // per la firma automatica	
	@XmlAttribute
	private String dominio;	
	@XmlAttribute
	private String location;
	@XmlAttribute
	private String reason;
	@XmlAttribute
	private String signer; //PADES fields
	@XmlAttribute
	private String tipoMarcatura;
	@XmlAttribute
	private boolean isMultipla;
	
	@XmlAttribute
	private String keyStoreFile;
	@XmlAttribute
	private String keyStorePassword;
	@XmlAttribute
	private String keyStoreFormat;
	@XmlAttribute
	private String keyAlias;
	@XmlAttribute
	private String keyPassword;
	@XmlAttribute
	private String trustStoreFile;
	@XmlAttribute
	private String trustStorePassword;
	@XmlAttribute
	private String trustStoreFormat;
	@XmlAttribute
	private String certificateFile;
	@XmlAttribute
	private String certificateAlias;
	@XmlAttribute
	private String certificatePassword;	
//	@XmlAttribute
//	private String nodeRef;
	@XmlAttribute
	private String idDocumento;
	
	public SignRemoteDTORequest(){}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getUsernameWs() {
		return usernameWs;
	}


	public void setUsernameWs(String usernameWs) {
		this.usernameWs = usernameWs;
	}


	public String getPasswordWs() {
		return passwordWs;
	}


	public void setPasswordWs(String passwordWs) {
		this.passwordWs = passwordWs;
	}


	public String getUrlWs() {
		return urlWs;
	}


	public void setUrlWs(String urlWs) {
		this.urlWs = urlWs;
	}


	public String getOtp() {
		return otp;
	}


	public void setOtp(String otp) {
		this.otp = otp;
	}


	public byte[] getHash() {
		return hash;
	}


	public void setHash(byte[] hash) {
		this.hash = hash;
	}


	public boolean isWithTimestamp() {
		return withTimestamp;
	}


	public void setWithTimestamp(boolean withTimestamp) {
		this.withTimestamp = withTimestamp;
	}


	public boolean isLevelBes() {
		return levelBes;
	}


	public void setLevelBes(boolean levelBes) {
		this.levelBes = levelBes;
	}

	public byte[] getDocumento() {
		return documento;
	}


	public void setDocumento(byte[] documento) {
		this.documento = documento;
	}


	public boolean isRetrieveDocument() {
		return retrieveDocument;
	}


	public void setRetrieveDocument(boolean retrieveDocument) {
		this.retrieveDocument = retrieveDocument;
	}


	public boolean isAutomaticSign() {
		return isAutomaticSign;
	}


	public void setAutomaticSign(boolean isAutomaticSign) {
		this.isAutomaticSign = isAutomaticSign;
	}


	public boolean isCounterSign() {
		return isCounterSign;
	}


	public void setCounterSign(boolean isCounterSign) {
		this.isCounterSign = isCounterSign;
	}


	public boolean isDetached() {
		return isDetached;
	}


	public void setDetached(boolean isDetached) {
		this.isDetached = isDetached;
	}


	public boolean isOnlyHash() {
		return isOnlyHash;
	}


	public void setOnlyHash(boolean isOnlyHash) {
		this.isOnlyHash = isOnlyHash;
	}


	public String getFirmaRemotaUtils() {
		return firmaRemotaUtils;
	}


	public void setFirmaRemotaUtils(String firmaRemotaUtils) {
		this.firmaRemotaUtils = firmaRemotaUtils;
	}


	public String getUtenteDelegante() {
		return utenteDelegante;
	}


	public void setUtenteDelegante(String utenteDelegante) {
		this.utenteDelegante = utenteDelegante;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getReason() {
		return reason;
	}


	public void setReason(String reason) {
		this.reason = reason;
	}


	public String getSigner() {
		return signer;
	}


	public void setSigner(String signer) {
		this.signer = signer;
	}


	public String getTipoMarcatura() {
		return tipoMarcatura;
	}


	public void setTipoMarcatura(String tipoMarcatura) {
		this.tipoMarcatura = tipoMarcatura;
	}


	public boolean isMultipla() {
		return isMultipla;
	}


	public void setMultipla(boolean isMultipla) {
		this.isMultipla = isMultipla;
	}
	
	public String getKeyStoreFile() {
		return keyStoreFile;
	}


	public void setKeyStoreFile(String keyStoreFile) {
		this.keyStoreFile = keyStoreFile;
	}


	public String getKeyStorePassword() {
		return keyStorePassword;
	}


	public void setKeyStorePassword(String keyStorePassword) {
		this.keyStorePassword = keyStorePassword;
	}


	public String getKeyStoreFormat() {
		return keyStoreFormat;
	}


	public void setKeyStoreFormat(String keyStoreFormat) {
		this.keyStoreFormat = keyStoreFormat;
	}


	public String getTrustStoreFile() {
		return trustStoreFile;
	}


	public void setTrustStoreFile(String trustStoreFile) {
		this.trustStoreFile = trustStoreFile;
	}


	public String getTrustStorePassword() {
		return trustStorePassword;
	}


	public void setTrustStorePassword(String trustStorePassword) {
		this.trustStorePassword = trustStorePassword;
	}


	public String getTrustStoreFormat() {
		return trustStoreFormat;
	}


	public void setTrustStoreFormat(String trustStoreFormat) {
		this.trustStoreFormat = trustStoreFormat;
	}


	public String getCertificateFile() {
		return certificateFile;
	}


	public void setCertificateFile(String certificateFile) {
		this.certificateFile = certificateFile;
	}


	public String getCertificateAlias() {
		return certificateAlias;
	}


	public void setCertificateAlias(String certificateAlias) {
		this.certificateAlias = certificateAlias;
	}


	public String getCertificatePassword() {
		return certificatePassword;
	}


	public void setCertificatePassword(String certificatePassword) {
		this.certificatePassword = certificatePassword;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}

	public String getKeyAlias() {
		return keyAlias;
	}

	public void setKeyAlias(String keyAlias) {
		this.keyAlias = keyAlias;
	}
	
	public String getKeyPassword() {
		return keyPassword;
	}

	public void setKeyPassword(String keyPassword) {
		this.keyPassword = keyPassword;
	}
	
//	public NodeModelData getRefAlfrescoFirmato() {
//		return refAlfrescoFirmato;
//	}
//
//	public void setRefAlfrescoFirmato(NodeModelData refAlfrescoFirmato) {
//		this.refAlfrescoFirmato = refAlfrescoFirmato;
//	}

	public String getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(String idDocumento) {
		this.idDocumento = idDocumento;
	}


	/**
	 * NON CANCELLARE COSTRUTTORE USATO PER IL RIEMPIMENTO DEL FIRMA BEAN
	 */
	public SignRemoteDTORequest(String username, String password, String usernameWs, String passwordWs, String urlWs,
			String otp, byte[] hash, boolean withTimestamp, boolean levelBes, byte[] documento,
			boolean retrieveDocument, boolean isAutomaticSign, boolean isCounterSign, boolean isDetached,
			boolean isOnlyHash, String firmaRemotaUtils, String utenteDelegante, String dominio, String location,
			String reason, String signer, String tipoMarcatura, boolean isMultipla, 
			String keyStoreFile,String keyStorePassword, String keyStoreFormat,String keyAlias, String keyPassword, 
			String trustStoreFile, String trustStorePassword,String trustStoreFormat, 
			String certificateFile, String certificateAlias, String certificatePassword) {
		super();
		this.username = username;
		this.password = password;
		this.usernameWs = usernameWs;
		this.passwordWs = passwordWs;
		this.urlWs = urlWs;
		this.otp = otp;
		this.hash = hash;
		this.withTimestamp = withTimestamp;
		this.levelBes = levelBes;
		this.documento = documento;
		this.retrieveDocument = retrieveDocument;
		this.isAutomaticSign = isAutomaticSign;
		this.isCounterSign = isCounterSign;
		this.isDetached = isDetached;
		this.isOnlyHash = isOnlyHash;
		this.firmaRemotaUtils = firmaRemotaUtils;
		this.utenteDelegante = utenteDelegante;
		this.dominio = dominio;
		this.location = location;
		this.reason = reason;
		this.signer = signer;
		this.tipoMarcatura = tipoMarcatura;
		this.isMultipla = isMultipla;
		this.keyStoreFile = keyStoreFile;
		this.keyStorePassword = keyStorePassword;
		this.keyStoreFormat = keyStoreFormat;
		this.keyAlias = keyAlias;
		this.keyPassword = keyPassword;
		this.trustStoreFile = trustStoreFile;
		this.trustStorePassword = trustStorePassword;
		this.trustStoreFormat = trustStoreFormat;
		this.certificateFile = certificateFile;
		this.certificateAlias = certificateAlias;
		this.certificatePassword = certificatePassword;
	}


	@Override
	public String toString() {
		return "SignRemoteDTO [username=" + username + ", password=" + (password!=null && !password.isEmpty()) + ", usernameWs=" + usernameWs
				+ ", passwordWs=" + passwordWs + ", urlWs=" + urlWs + ", otp=" + otp + ", hash=" +  (new String(hash)!=null && new String(hash).isEmpty())
				+ ", withTimestamp=" + withTimestamp + ", levelBes=" + levelBes + ", documento="
				+  (new String(documento)!=null && !new String(documento).isEmpty())  + ", retrieveDocument=" + retrieveDocument + ", isAutomaticSign="
				+ isAutomaticSign + ", isCounterSign=" + isCounterSign + ", isDetached=" + isDetached + ", isOnlyHash="
				+ isOnlyHash + ", firmaRemotaUtils=" + firmaRemotaUtils + ", utenteDelegante=" + utenteDelegante
				+ ", dominio=" + dominio + ", location=" + location + ", reason=" + reason + ", signer=" + signer
				+ ", tipoMarcatura=" + tipoMarcatura + ", isMultipla=" + isMultipla + ", keyStoreFile=" + keyStoreFile
				+ ", keyStorePassword=" + keyStorePassword + ", keyStoreFormat=" + keyStoreFormat + ", keyAlias=" + keyAlias + ", keyPassword=" + keyPassword + ", trustStoreFile="
				+ trustStoreFile + ", trustStorePassword=" + trustStorePassword + ", trustStoreFormat="
				+ trustStoreFormat + ", certificateFile=" + certificateFile + ", certificateAlias=" + certificateAlias
				+ ", certificatePassword=" + certificatePassword + "]";
	}

	



	
	
	
	
	
}
