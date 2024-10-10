package regularExpersion;

import java.util.Date;

public class LogMetaData {
	
	 	private String fileName;
	    public String getFileName() {
			return fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getFilePath() {
			return filePath;
		}

		public void setFilePath(String filePath) {
			this.filePath = filePath;
		}

		public Date getCreationDate() {
			return creationDate;
		}

		public void setCreationDate(Date creationDate) {
			this.creationDate = creationDate;
		}

		public Date getLastModifiedDate() {
			return lastModifiedDate;
		}

		public void setLastModifiedDate(Date lastModifiedDate) {
			this.lastModifiedDate = lastModifiedDate;
		}

		public String getStationId() {
			return stationId;
		}

		public void setStationId(String stationId) {
			this.stationId = stationId;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getEnergySourceType() {
			return energySourceType;
		}

		public void setEnergySourceType(String energySourceType) {
			this.energySourceType = energySourceType;
		}

		public String getLogType() {
			return logType;
		}

		public void setLogType(String logType) {
			this.logType = logType;
		}

		private String filePath;
	    private Date creationDate;
	    private Date lastModifiedDate;
	    private String stationId;
	    private String location;
	    private String energySourceType;
	    private String logType;

	    // Constructor
	    public void LogMetadata(String fileName, String filePath, String stationId, String location, String energySourceType, String logType) {
	        this.fileName = fileName;
	        this.filePath = filePath;
	        this.creationDate = new Date();
	        this.lastModifiedDate = new Date();
	        this.stationId = stationId;
	        this.location = location;
	        this.energySourceType = energySourceType;
	        this.logType = logType;
	    }



}
