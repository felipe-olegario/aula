module.exports = {
  production: {
    username: 'felipe-olegario',
    password: 'Laurinha070700',
    database: 'lakers',
    host: 'lakers.database.windows.net',
    dialect: 'mssql',
    xuse_env_variable: 'lakers',
    dialectOptions: {
      options: {
        encrypt: true
      }
    },
    pool: { 
      max: 5,
      min: 1,
      acquire: 5000,
      idle: 30000,
      connectTimeout: 5000
    }
  }
};