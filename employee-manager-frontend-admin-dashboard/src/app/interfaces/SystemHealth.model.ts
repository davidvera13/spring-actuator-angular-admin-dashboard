export interface SystemHealth {
  status: string;
  components: {
    db: {
      status: string,
      details: {
        database: string,
        validationQuery: string
      }
    },
    diskSpace: {
      status: string,
      details: {
        total: string,
        free: string,
        threshold: string,
        exists: boolean
      }
    },
    ping: {
      status: string
    }
  };
}
