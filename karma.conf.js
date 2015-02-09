module.exports = function (config) {
    config.set({
        basePath: './',
        frameworks: ['jasmine'],
        browsers: [
            'PhantomJS'
        ],
        files: [
            'node_modules/**/*.js',
            'src/main/resources/**/*.js',
            'src/test/js/**/*.spec.js'
        ]
    });
};