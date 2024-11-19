package com.pd.clinic.security;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class TenantContext {

	private static final ThreadLocal<TenantData> TENANT_CONTEXT = new ThreadLocal<>();

	// Method to set tenant data in the context
	public static void set(TenantData tenantData) {
		TENANT_CONTEXT.set(tenantData);
	}

	// Method to retrieve tenant data from the context
	public static TenantData get() {
		return TENANT_CONTEXT.get();
	}

	// Method to reset (clear) tenant data from the context
	public static void reset() {
		TENANT_CONTEXT.remove();
	}

	// Convenience method to set tenant data using individual parameters
	public static void setTenantData(UUID tenantId, String tenantName, String tenantKey) {
		TenantData tenantData = new TenantData.Builder()
                .tenantId(UUID.randomUUID())
                .tenantName(tenantName)
                .tenantKey(tenantKey)
                .build();
		TENANT_CONTEXT.set(tenantData);
	}

	public static class TenantData {

		private UUID tenantId; // Tenant table ID
		private String tenantName; // Tenant name
		private String tenantKey; // Unique tenant key in uppercase

		// Private constructor to enforce builder usage
		private TenantData(Builder builder) {
			this.tenantId = builder.tenantId;
			this.tenantName = builder.tenantName;
			this.tenantKey = builder.tenantKey;
		}

		// Static inner Builder class
		public static class Builder {
			private UUID tenantId;
			private String tenantName;
			private String tenantKey;

			public Builder tenantId(UUID tenantId) {
				this.tenantId = tenantId;
				return this;
			}

			public Builder tenantName(String tenantName) {
				this.tenantName = tenantName;
				return this;
			}

			public Builder tenantKey(String tenantKey) {
				this.tenantKey = tenantKey;
				return this;
			}

			public TenantData build() {
				return new TenantData(this);
			}
		}

	}
}
