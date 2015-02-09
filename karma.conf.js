module.exports = function (config) {
    config.set({
        basePath: './',
        frameworks: ['jasmine'],
        browsers: [
            'Chrome',
            'PhantomJS'
        ],
        files: [
            'src/test/js/**/*.spec.js'
        ]
    });
};